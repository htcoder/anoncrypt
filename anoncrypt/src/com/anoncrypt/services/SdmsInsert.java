package com.anoncrypt.services;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class SdmsInsert {

	/**
	 * @param args
	 */
	public static boolean insert(String cipher) {
		
		String url = "jdbc:oracle:thin:@//localhost:1521/XE ";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con = DriverManager.getConnection(url, "system", "root");
			System.out.println("Connected");
			System.out.println(cipher);
			
			
			String query = "insert into SDMS values (?,?)";
			PreparedStatement pst = con.prepareStatement(query);				
			pst.setInt(1, 0);
			pst.setString(2,cipher);
			pst.executeUpdate();
			
			System.out.println("Insert Success");
			
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return true;


	}

}



