package com.tech.Student_Database_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class View_Result {
  public void ViewResults() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDashboard1","root","Astronut12@");
    Statement stmt=connect.createStatement();
    ResultSet rs=stmt.executeQuery("select student_id,mark1,mark2,mark3,total,percentage,grade from results");
    while(rs.next()){
      System.out.println(rs.getString("student_id")+" "+rs.getInt("mark1")+" "+rs.getInt("mark2")+" "+rs.getInt("mark3")+" total="+rs.getInt("total")+" percent="+rs.getDouble("percentage")+" grade="+rs.getString("grade"));
    }
    rs.close();
    stmt.close();
    connect.close();
  }
}
