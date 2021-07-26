package dbclient;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
public class CollegeDataBase {
	
	
	public static void main(String []args) {
		
		collegedbjava();
	}
	static void collegedbjava() {
		 Connection Conn = null;
		 Statement  st = null;
		 ResultSet   rs= null;
		 try {
		
		Conn = DriverManager.getConnection("jdbc:mysql://localhost/college?"+ "user=root&password=root");
		
		st=Conn.createStatement();
		rs=st.executeQuery("select  * from college.marks");
		
		while(rs.next()) {
			System.out.println("registe no"+rs.getString("regno"));
			System.out.println("tamil"+rs.getInt("tamil"));
			System.out.println("english"+rs.getInt("english"));
			System.out.println("science::"+rs.getInt("science"));
			System.out.println("social::"+rs.getInt("social"));
			System.out.println("maths::"+rs.getInt("maths"));
			
		}
		 }
		 catch(SQLException ed) {
			 ed.printStackTrace();		 
		 }
	}
	    
	
	

}
