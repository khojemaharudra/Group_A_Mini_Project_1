package com.Group_A.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentTest {
Connection connection=null;
	public Connection getStudentDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}