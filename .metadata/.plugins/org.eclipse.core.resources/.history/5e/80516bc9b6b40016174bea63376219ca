package ch10;

import java.sql.*;

public class DriverTest{
	private static final String password = "1111";
	
	public static void main(String args[]){
		Connection con;

		try{
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", password);
			System.out.println("Success");
		}
		catch(SQLException ex){ System.out.println("SQLException" + ex);}
		catch(Exception ex){ System.out.println("Exception:" + ex);}
	}
}