package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static String userName ="tijnohkzlmtmhv";
	private static String password ="b0338e893ed4bef55b8eec797d487c5e0b57744abe8f0dd037de5f6e68fd285d";
	private static String connectionURL ="jdbc:postgresql://ec2-52-7-39-178.compute-1.amazonaws.com:5432/d7id7pgro411tl?sslmode=require";
	private static String driverClass = "org.postgresql.Driver";
	public static Connection getDBConnection(){
		
		Connection conn = null;
		
		try {
			Class.forName(driverClass);
			
			conn = DriverManager.getConnection(connectionURL, userName, password);
			
			if(conn!=null)
			{
				
				System.out.println("connected to db..");
			}
			else{
				
				System.out.println("connected to db..");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return conn; 
		
		
	}
	
	
	public static void main(String[] args) {
		
		DBConnection.getDBConnection();
	}
	
}
