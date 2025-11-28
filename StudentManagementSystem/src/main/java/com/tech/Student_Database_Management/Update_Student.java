package com.tech.Student_Database_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update_Student {
  public void UpdateStudent(Scanner sc) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDashboard1","root","Astronut12@");
    Statement stmt=connect.createStatement();
    System.out.println("Enter Id to update");
    String id=sc.nextLine();
    System.out.println("Enter new name");
    String name=sc.nextLine();
    System.out.println("Enter new course");
    String course=sc.nextLine();
    int rows=stmt.executeUpdate("update students set name='"+name+"',course='"+course+"' where id='"+id+"'");
    if(rows==0){
      System.out.println("Student missing");
    }else{
      System.out.println("Student updated");
    }
    stmt.close();
    connect.close();
  }
}
