package com.tech.Student_Database_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Add_Result {
  public void AddResult(Scanner sc) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDashboard1","root","Astronut12@");
    Statement stmt=connect.createStatement();
    System.out.println("Enter student id");
    String id=sc.nextLine();
    System.out.println("Enter mark 1");
    int m1=Integer.parseInt(sc.nextLine());
    System.out.println("Enter mark 2");
    int m2=Integer.parseInt(sc.nextLine());
    System.out.println("Enter mark 3");
    int m3=Integer.parseInt(sc.nextLine());
    int total=m1+m2+m3;
    double percent=total/3.0;
    String grade;
    if(percent>=80){
      grade="A";
    }else if(percent>=60){
      grade="B";
    }else if(percent>=40){
      grade="C";
    }else{
      grade="D";
    }
    stmt.executeUpdate("insert into results(student_id,mark1,mark2,mark3,total,percentage,grade) values ('"+id+"',"+m1+","+m2+","+m3+","+total+","+percent+",'"+grade+"')");
    stmt.close();
    connect.close();
    System.out.println("Result saved");
  }
}
