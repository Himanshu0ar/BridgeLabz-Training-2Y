package com.tech.Student_Database_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Delete_Student {
  public void DeleteStudent(Scanner sc) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDashboard1","root","Astronut12@");
    Statement stmt=connect.createStatement();
    System.out.println("Enter Id to delete");
    String id=sc.nextLine();
    int rows=stmt.executeUpdate("delete from students where id='"+id+"'");
    if(rows==0){
      System.out.println("Student missing");
    }else{
      stmt.executeUpdate("delete from results where student_id='"+id+"'");
      System.out.println("Student removed");
    }
    stmt.close();
    connect.close();
  }
}
