package com.grayMatter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CalculaterTest {
	
	Calculator cal = new Calculator();
	
	@Test
	@Category(MarkerInterface.class)
	public void add() {
		assertEquals(5, cal.add(2, 3));
	}
	
	
	@Test
	@Category(MarkerInterface.class)
	public void mul() {
		assertEquals(6, cal.mul(2, 3));
	}
	
	@Test
	public void div() {
		assertEquals(5, cal.div(20, 4));
	}
	
	@Test
	@Category(MarkerInterface.class)
	public void sub() {
		assertEquals(5, cal.sub(10, 5));
	}
	
	
	@Test
	@Category(MarkerInterface.class)
	public void linear() {
		int arr[] = {22,33,44,55,66};
		int key =33;
		assertEquals(1, cal.findKey(arr, key));
	}
	
	@Test
	public void even() {		
		assertTrue(cal.isEven(34));
	}
	
	@Test
	public void isstringnull() {
		assertNull(null, cal.isnull(null));
	}
	
	
	@Before
	public void printLogBeforeMethod() {
		System.out.println("Before test");
	}
	
	
	@After
	public void printLogAfterMethod() {
		System.out.println("After test");
	}
	
	@BeforeClass
	public static void printLogBeforeClassMethod() {
		System.out.println("Before Class test");
	}
	
	
	@Test
    public void check() throws ClassNotFoundException, SQLException {
        DbConnection dbConnection = new DbConnection("jdbc:mysql://localhost:3306/grayMatter", "root", "password");
        Connection con = dbConnection.checKb();
        assertEquals(con.getMetaData().getURL(), "jdbc:mysql://localhost:3306/grayMatter");
    }

}
