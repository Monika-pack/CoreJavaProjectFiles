package Disp1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 **
 * Servlet implementation class Display1
 */
@WebServlet("/Display1")
public class Display1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn=null;
	Statement st=null;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		DbConnect dconn=new DbConnect();
		conn=dconn.getConnection();
		
		 PreparedStatement pst=null;
		    /**
		     * @see HttpServlet#HttpServlet()
		 
		        // TODO Auto-generated constructor stub
		    }

			/**
			 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
			 */
		try {
			st=conn.createStatement();
		
				String s="select * from edustudent";
				ResultSet rs=st.executeQuery(s);
				out.println("<table border='1' align='center'>");
				out.println("<tr><th>sname</th><th>semail</th><th>spassword</th><th>age</th></tr>");
				while(rs.next()) {
					
				   
				    
					
					
					out.println("<tr><td>"+rs.getString("sname")+"</td><td>"+rs.getString("semail")+"</td> <td>"+rs.getString("spassword")+"</td> <td>"+rs.getInt("age")+"</td></tr>");
				}
				 out.println("</table>"); 
				out.println("</body></html>");
				//con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}



	}


