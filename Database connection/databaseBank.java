package dbclient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


public class databaseBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getDatabaseResults();
	}
	static void getDatabaseResults()
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			  conn =DriverManager.getConnection("jdbc:mysql://localhost/bank?"
                      + "user=root&password=root");
	          
			  stmt=conn.createStatement();
			  rs=stmt.executeQuery("select * from bank.bankmaster");
			  while(rs.next()){
				  System.out.println(rs.getString("bankname"));
				  System.out.println(rs.getInt("quartely_income"));
				  System.out.println(rs.getInt("halfyearly_income"));
				  System.out.println(rs.getInt("annual_income"));
						  
			  }
			  
		}catch ( SQLException ex) {
			 ex.printStackTrace();
			}
		}
	
		
		
		
		
		}

		
		
