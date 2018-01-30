package de.tum.in.dss.beansProject;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection con = null;
    	String dbName = "auction";
    	String user = "root";
    	String pw = "rooter";
    	try {
    		con = DriverManager.getConnection("jdbc:mysql://localhost/"+ dbName,
    				user, pw);
    		Statement st = con.createStatement();
    		ResultSet rs = st.executeQuery("select * from users");
    		int colIdx = rs.findColumn("firstName");
    		while(rs.next()) {
    			System.out.println(rs.getString(colIdx));
    		}
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	finally {
    		try {
    			if(con!=null)
    				con.close();
    		}
    		catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    }
    
}


