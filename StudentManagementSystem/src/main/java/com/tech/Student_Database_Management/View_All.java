package com.tech.Student_Database_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class View_All {
  public void ViewStudents() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
     Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDashboard1","root","Astronut12@");
    Statement stmt=connect.createStatement();
     ResultSet rs=stmt.executeQuery("select id,name,course from students");
     while(rs.next()){
      System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("course"));
    }
    rs.close();
    stmt.close();
    connect.close();
  }
}
