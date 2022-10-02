package com.Group_A.miniproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quize {
	Scanner scanner = new Scanner(System.in);
	private int studentId;
	private String firstName;
	private String lastName;
	private int Percentage; 
	private int Marks;
	private String Grade;

	public void buildLogic() {
		System.out.println("Enter Number of Students: ");
		int input = scanner.nextInt();
		
		for(int i=1; i<=input; i++) {
			int correctAnsCount = 0;
			int wrongAnsCount = 0;
			System.out.println();
			System.out.println("Start Student "+i+" Quize Exam");
			studentId = i;
			System.out.println("Enter Student First name: ");
			firstName = scanner.next();
			System.out.println("Enter Student Last Name: ");
			lastName = scanner.next();
		Questions q1 = new Questions( "1) Which of the following is not a Java features?", "A.Dynamic", "B.Architecture Neutral", "C.Use of pointers", "D.Object-oriented");
		Questions q2 = new Questions( "2) is used to find and fix bugs in the Java programs.", "A.JVM", "B.JRE", "C.JDK", "D.JDB");
		Questions q3 = new Questions( "3) Which of the following is a valid declaration of a char?", "A.char ch = '\\utea';", "B.char ca = 'tea';", "C.char cr = \\u0223;", "D.char cc = '\\itea'");
		Questions q4 = new Questions( "4) What is the return type of the hashCode() method in the Object class?", "A.Object", "B.int", "C.long", "D.void");
		Questions q5 = new Questions( "5) Which of the following is a valid long literal?", "A.ABH8097", "B.L990023", "C.904423", "D.0xnf029L");
		Questions q6 = new Questions( "6) What does the expression float a = 35 / 0 return?", "A.0", "B.Not a Number", "C.Infinity", "D.Run time exception");
		Questions q7 = new Questions( "7) Which of the following is a marker interface?", "A.Runnable interface", "B.Remote interface", "C.Readable interface", "D.Result interface");
		Questions q8 = new Questions( "8) Which of the following is true about the anonymous inner class?", "A.It has only methods", "B.Objects can't be created", "C.It has a fixed class name", "D.It has no class name");
		Questions q9 = new Questions( "9) Which package contains the Random class?", "A.java.util package", "B.java.lang package", "C.java.awt package", "D.java.io package");
		Questions q10 = new Questions( "10) An interface with no fields or methods is known as", "A.unnable Interface", "B.Marker Interface", "C.Abstract Interface", "D.CharSequence Interface");
		
		HashMap<Questions,Character> hMap = new HashMap<Questions,Character>();
		hMap.put(q1, 'C');
		hMap.put(q2, 'D');
		hMap.put(q3, 'A');
		hMap.put(q4, 'B');
		hMap.put(q5, 'D');
		hMap.put(q6, 'C');
		hMap.put(q7, 'B');
		hMap.put(q8, 'D');
		hMap.put(q9, 'A');
		hMap.put(q10, 'B');
		
		for(Map.Entry<Questions, Character> map:hMap.entrySet()) {
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			
			System.out.println("Enter your Answer Option: ");
			Character answerInput = scanner.next().charAt(0);
			
			int correctAnswer = Character.compare(answerInput, map.getValue());
			
			if(correctAnswer==0) {
				System.out.println("Answer is correct");
				correctAnsCount++;
			}else {
				System.out.println("Answer is wrong");
				wrongAnsCount++;
			}
			 System.out.println();
			
		}	
			System.out.println();
			System.out.println("------------Result-------------");
			System.out.println("Student Name: "+firstName+" "+lastName);
			System.out.println("Total Number of Questions: " + hMap.size());
			System.out.println("Total correct Answers: "+ correctAnsCount);
			System.out.println("Toatal Wrong Answers: " + wrongAnsCount);
			Percentage = (100*correctAnsCount)/hMap.size();
			System.out.println("Total percentage: " + Percentage);
			Grade = null;
			if(Percentage>=80) {
				System.out.println("Grade: Class A" + (Grade = "A"));
			}else if(Percentage<80 && Percentage>=60) {
				System.out.println("Grade: Class B "+ (Grade = "B"));
			}else if(Percentage<60 && Percentage>=50) {
				System.out.println("Grade: Class C " + (Grade = "C"));
			}else if(Percentage<50) {
				System.out.println("Grade: Class D: Fail " + (Grade = "D"));
			}
			Marks = correctAnsCount;
			
		
			getStudentDetail(studentId, firstName, lastName, Percentage, Marks, Grade);	
			StudentInput studentInput = new StudentInput();
			studentInput.insertStudentData(studentId, firstName, lastName, Percentage, Marks, Grade);
	}	
}
	public void getStudentDetail(int studentId, String firstName, String lastName, int percentage, int marks, String grade) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Percentage = percentage;
		this.Marks = marks;
		this.Grade = grade;
		
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPercentage() {
		return Percentage;
	}
	public void setPercentage(int percentage) {
		Percentage = percentage;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	
}
