package com.test.jersey.DemoJersey;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

	Connection con = null;
	
	public AlienRepository() {
		
		String url = "jdbc:mysql://localhost:3306/restdb";
		String user = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public List<Alien> getAliens() {
		
		List<Alien> aliens = new ArrayList<Alien>();
		String sql = "select * from alien";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				
				Alien a = new Alien();
				a.setDots(rs.getInt(1));
				a.setName(rs.getString(2));
				
				aliens.add(a);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return aliens;
	}
	
	public Alien getAlien(int id) {
		
		Alien a = new Alien();
		String sql = "select * from alien where id="+id;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				a.setDots(rs.getInt(1));
				a.setName(rs.getString(2));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return a;
	}
	
	public void createAlien(Alien a) {
		String sql = "insert into alien values (?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, a.getDots());
			st.setString(2, a.getName());
			st.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
