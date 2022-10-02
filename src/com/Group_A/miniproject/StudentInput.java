package com.Group_A.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentInput {
	PreparedStatement prs = null;
	Connection con = null;

	public void insertStudentData(int studentId, String firstName,String lastName,int Percentage,int Marks, String Grade) {
		try {
		StudentTest studentTest=new StudentTest();
		 con=studentTest.getStudentDetails();
		prs=con.prepareStatement("insert into studentdetails(StudentId, firstName, lastName, Percentage, Marks, Grade)values(?,?,?,?,?,?)");
		prs.setInt(1, studentId);
		prs.setString(2, firstName);
		prs.setString(3, lastName);
		prs.setInt(4, Percentage);
		prs.setInt(5, Marks);
		prs.setString(6, Grade);
		
		int i=prs.executeUpdate();
		System.out.println("Record is inserted successfully.." + i);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
		public static void main(String[] args) throws SQLException { 
			Quize quize = new Quize();
			quize.buildLogic();
			StudentInput studentInput = new StudentInput();
//			int studentId = quize.getStudentId();
//			String firstName = quize.getFirstName();
//			String lastName = quize.getLastName();
//			int Percentage = quize.getPercentage();
//			int Marks = quize.getMarks();
//			String Grade = quize.getGrade();
//			studentInput.insertStudentData(studentId, firstName, lastName, Percentage, Marks, Grade);
//			System.out.println("Enter studentId>>"); 
//			int studentId = sc.nextInt(); 
//			System.out.println("Enter first name>>"); 
//			String firstName = sc.next(); 
//			System.out.println("Enter last name>>"); 
//			String lastName = sc.next();
//			System.out.println("Enter Percentage>>"); 
//			Double Percentage = sc.nextDouble();
//			System.out.println("Enter Marks>>"); 
//			int Marks = sc.nextInt();
//			System.out.println("Enter Grade>>"); 
//			String Grade = sc.next();
			 
			
			
//			;
		
			
			}
			}

