package dbclient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnector {

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
		    conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/school?" +
		                                   "user=root&password=root");

		    stmt = conn.createStatement();
		    rs = stmt.executeQuery("SELECT * from timetable ");  
		    
		    while(rs.next())
		    {
		     System.out.println(rs.getString("Field"));
		     System.out.println(rs.getString("T"));
		    }

		   
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		finally {

		    if (rs != null) {
		        try {
		            rs.close();
		        } catch (SQLException sqlEx) { } // ignore

		        rs = null;
		    }

		    if (stmt != null) {
		        try {
		            stmt.close();
		        } catch (SQLException sqlEx) { } // ignore

		        stmt = null;
		    }
		
		}
		
		
	}
}
