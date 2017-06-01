package com.hibernate.poc;

import java.awt.print.Printable;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String username="hbstudent";
		String password="hbstudent";
		Connection con = null;
		
		try{
				con = DriverManager.getConnection(url,username,password);
		}
		
		catch(Exception exception){
			exception.printStackTrace();
			
		}
		
		if(con!=null){System.out.println("Connection Successful");}
		else {System.out.println("Wrong Connection");}

	}

}
