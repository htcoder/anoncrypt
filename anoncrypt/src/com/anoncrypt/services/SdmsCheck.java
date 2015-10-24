package com.anoncrypt.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SdmsCheck {
	;

	public static boolean select(String cipher) {
		boolean c = false;
		String url = "jdbc:oracle:thin:@//localhost:1521/XE ";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con = DriverManager.getConnection(url, "system", "root");
			System.out.println("Connected to  checking module");
			System.out.println("The cipher I got in checking module"+cipher);
			
			
			String query = "select * from  SDMS where HIT=? and CIPHER=?";
			PreparedStatement pst = con.prepareStatement(query);				
			pst.setInt(1, 0);
			pst.setString(2,cipher);
			//pst.executeUpdate();
			ResultSet rs = pst.executeQuery(/*query*/);
			
			System.out.println("a line before");
					
		
		while(rs.next()){
			c=true;
			System.out.println("\n\t DB Finalreturn "+c);
			// deletion logic
						
			String updateTableSQL = "UPDATE SDMS SET HIT = ? WHERE CIPHER = ?";
			PreparedStatement preparedStatement = con.prepareStatement(updateTableSQL);
			
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, cipher);
			preparedStatement .executeUpdate();
			System.out.println("Updated-Deleted the cipher ");			
			
			
		}
		
		
		}

	 catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;

	}

}
