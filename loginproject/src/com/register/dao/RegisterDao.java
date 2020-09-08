package com.register.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	String sql = "INSERT INTO users VALUES (0, ?, ?)";
	String url = "jdbc:mysql://localhost:3306/testingSite";
	String root = "root";
	String password = "karcho123";
	Connection con;
	PreparedStatement st;
	public RegisterDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean registration(String uname, String pass){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "karcho123");
			st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			int rows = st.executeUpdate();
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if (st == null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
        }
		return false;
		
	}
	
}
