package coffeeManagement__System;

import java.sql.*;
public class Clonn {
	Connection c;
	Statement s;
	public Clonn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql:///projectcms","root","Chitra");
			s=c.createStatement();
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

//	public static void main(String[] args) {
//		
//
//	}

}