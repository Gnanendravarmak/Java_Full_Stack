package com.grayMatter.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
//@ComponentScan(basePackages = "com.grayMatter.dbConnection")
public class DbClassUtils implements DbInterfaceUtils {
	
	
	Connection conn;
	
	
	public List<Regions> getAll() throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select * from regions");
		ResultSet rs= ps.executeQuery();
		
		List<Regions> rList = new ArrayList<>();
		
		while(rs.next()) {
			rList.add(new Regions(rs.getInt(1), rs.getString(2)));
		}
		
		return rList;
		
	}
	
	public void addRegion(Regions region) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO regions (id, name) VALUES (?, ?)");
		ps.setInt(1, region.getId());
		ps.setString(2, region.getName());
		ps.executeUpdate();
		
//		ps=conn.prepareStatement("select * from regions where id=?");
//		ps.setInt(1, region.getId());
//		ResultSet rs = ps.executeQuery();
		
//		return new Regions(rs.getInt(1),rs.getString(2));
		
	}
	
	public void deleteRegion(int id) throws SQLException {
		PreparedStatement ps = conn.prepareCall("delete from regions where id=?");
		ps.setInt(1, id);
		
		int row = ps.executeUpdate();
		
		if(row==1) {
			System.out.println("row deleted");
		}
	}
	
	
	public Regions update(Regions region) throws SQLException {
		
		
		PreparedStatement ps = conn.prepareStatement("UPDATE regions SET name = ? WHERE id = ?");
		ps.setString(1, region.getName());
		ps.setInt(2, region.getId());
		
		Regions res=null;
		
		int row = ps.executeUpdate();
		
		if(row == 1) {
			System.out.println("Value updated");
		}
		
		return region;
		
	}

}
