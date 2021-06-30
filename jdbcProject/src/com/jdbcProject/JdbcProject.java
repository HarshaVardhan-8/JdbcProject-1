package com.jdbcProject;

import java.sql.*;

public class JdbcProject {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:5910/ticket","root","root3");
		Statement st = con.createStatement();
		String query = "SELECT * FROM USER";
		ResultSet rs = st.executeQuery(query);
		String loginName="";
		String eMail="";
		while(rs.next())
		{ 
			loginName = rs.getString("loginname");
			eMail = rs.getString("email");
			System.out.println(loginName+" "+eMail);
		}

	}

}
