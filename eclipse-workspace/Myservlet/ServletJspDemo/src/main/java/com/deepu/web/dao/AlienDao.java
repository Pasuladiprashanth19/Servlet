package com.deepu.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.deepu.web.model.Alien;

public class AlienDao {
	public Alien getAlien(int aid)
	{
		Alien a =new Alien();
		a.setAid(101);
		a.setName("prashant");
		a.setTech("java");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/prashanth","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where aid="+aid);
			if(rs.next()) {
				a.setAid(rs.getInt("aid"));
				a.setName(rs.getString("name"));
				a.setTech(rs.getString("tec"));
			}
			
			
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		return a;
		
		
		
	}
	

}
