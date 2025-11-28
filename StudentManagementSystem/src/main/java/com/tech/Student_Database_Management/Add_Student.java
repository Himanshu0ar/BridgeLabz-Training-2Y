package com.tech.Student_Database_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Add_Student {
  public void AddStudent(Scanner sc) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDashboard1","root","Astronut12@");
    Statement stmt=connect.createStatement();
    System.out.println("Enter Id");
    String id=sc.nextLine();
    System.out.println("Enter student name");
    String studentName=sc.nextLine();
    System.out.println("Enter course name");
    String courseName=sc.nextLine();
    stmt.executeUpdate("insert into students(id,name,course) values ('"+id+"','"+studentName+"','"+courseName+"')");
    stmt.close();
    connect.close();
    System.out.println("Student saved");
  }
}
