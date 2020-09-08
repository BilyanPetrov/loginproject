package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String sql = "select * from users where uname=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/testingSite";
	public boolean checkDetails(String username, String pass) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "root", "karcho123");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, username);
		st.setString(2, pass);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			return true;
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return false;
	}
}
