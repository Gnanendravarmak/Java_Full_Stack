package com.grayMatter.dbConnection;

import java.sql.SQLException;
import java.util.List;

public interface DbInterfaceUtils {
	List<Regions> getAll() throws SQLException;
	 void addRegion(Regions region) throws SQLException;
	 void deleteRegion(int id) throws SQLException;
	 Regions update(Regions region) throws SQLException;
}
