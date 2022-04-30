package monikadb;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class MavanjavaCrudeoperations {
	static Connection conn=null;
	static Statement st=null;
	static Scanner sc;
	private static String sno;
	String veg;
	String nonveg;
	float rate;
	
	public static void selectRecord() throws SQLException {
		
		try {
			conn=ConnectionUtilityClasss.getConnection();
			st=conn.createStatement();
			//select  = select from hotels values;
			//select
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
		conn.close();
		}
	}
	public static void updateRecord() {
		try {
			conn=ConnectionUtilityClasss.getConnection();
			st=conn.createStatement();
			
			//update
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void deleteRecord()  {
		try {
			conn=ConnectionUtilityClasss.getConnection();
			st=conn.createStatement();
			System.out.println("Enter sno");
			String sno =sc.next();
			String s="delete from department where beachsno="+ sno;
			st.executeUpdate(s);
			//delete
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	/**
	 * 
	 */
	public static void insertRecord() {
		 sc= new Scanner(System.in);
		try {
			conn=ConnectionUtilityClasss.getConnection();
			st=conn.createStatement();
			System.out.println("Enter HOTEL details :");
			String sno=sc.next();
			System.out.println("Enter veg  :");
			
			String veg=sc.next();
			System.out.println("Enter  non veg :");
			String nonveg=sc.next();
			System.out.println("Enter a items wanted  :");
			String items=sc.next();
		  
			//System.out.println("");
			//String vegname=sc.next();
			//System.out.println("Enter placess 2 ");
			//String nonvegname = sc.next();
			System.out.println("billing   rate");
			String rate = sc.next();
			 rate = null;
			String vegname = null;
			String nonvegname=null;
			String s="insert into hotels values(" +sno+","+ ","+veg+ "'"+ "nonveg,"+  "'"+items+","+rate+");";
					
			//st.executeUpdate(s);
			
		//int i=0;
	//if(i>0) {
				//System.out.println("Record is inserted successfully");
			//}
			//else {
				//System.out.println("Not inserted");
			//}
			
			//insert  
		} catch (Exception e) {
			
			e.printStackTrace();
			
		
		}
	}
	public static void main(String[] args) throws SQLException {
		
		while(true) {
		System.out.println("*****MENU********");
		System.out.println("1.VISITING HOTEL:");
		System.out.println("2.VISITING BEACH :");
		System.out.println("3.VISITING THEATRES :");
		
		sc=new Scanner(System.in);
		System.out.println("Enter your option");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:  MavanjavaCrudeoperations.insertRecord();
		         break;
		case 2:  MavanjavaCrudeoperations.deleteRecord();
        		break;
		case 3: MavanjavaCrudeoperations.updateRecord();
		break;
		case 4: MavanjavaCrudeoperations.selectRecord();
		break;
		         
		}
		System.out.println("Do you want to continue Y/N");
char choice=sc.next().charAt(0);
		if(ch=='N' || ch=='n') {
			break;
		}
		}

	}

}
