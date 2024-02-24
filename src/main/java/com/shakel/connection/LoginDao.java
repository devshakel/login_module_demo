package com.shakel.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public Connection con;
	String url = "jdbc:mysql://localhost:3306/loginDemo";
	String username="root";
	String password="9364";
	String sql = "select * from login where username=? and password=?";
	public boolean checkDetails(String uname,String pd) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1,uname);
			psmt.setString(2,pd);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

}