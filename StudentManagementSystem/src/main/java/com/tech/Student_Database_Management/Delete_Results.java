package com.tech.Student_Database_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Delete_Results {
  public void DeleteResult(Scanner sc) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDashboard1","root","Astronut12@");
    Statement stmt=connect.createStatement();
    System.out.println("Enter student id to delete result");
    String id=sc.nextLine();
    int rows=stmt.executeUpdate("delete from results where student_id='"+id+"'");
    if(rows==0){
      System.out.println("Result missing");
    }else{
      System.out.println("Result deleted");
    }
    stmt.close();
    connect.close();
  }
}
