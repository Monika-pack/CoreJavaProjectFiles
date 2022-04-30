package monikadb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class DelAddUpdateDisplay {
                                    //INSERTING RECORDS INTO THE TABLE EDUDB//
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity","root","root");  
		
		Statement stmt=con.createStatement();  
		
		String ins="insert into mytable values(11)";
		
		int i=stmt.executeUpdate(ins);
		if(i>0) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Not inserted");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	  
	}
}
