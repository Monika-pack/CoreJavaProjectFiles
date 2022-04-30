package registration;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnect {
	

	
	   //Database connection , get the connection
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/edudb";
		String un="root";
	    String pass="root";
	    Connection conn=null;
	    
	    public Connection getConnection() {
	    	
	    	try {
	    	  Class.forName(driver);
	    	  conn=DriverManager.getConnection(url,un,pass);
	    	  
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	if(conn==null) {
	    		System.out.println("Connection Error");
	    	}
	    	
			return conn;
			
	    }
	    }
		
	