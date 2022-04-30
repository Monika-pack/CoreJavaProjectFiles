package updateregistration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet1
 */

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	
	/**
	 * Servlet implementation class UpdateServlet
	 */
	@WebServlet("/UpdateServlet1")
	public class UpdateServlet1 extends HttpServlet {
		private static final long serialVersionUID = 1L;
	     Connection conn=null;  
	     PreparedStatement pst=null;
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public UpdateServlet1() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
			String email=request.getParameter("semail");
			String pass=request.getParameter("spass");
			
			JdbcConnection dconn=new JdbcConnection();
			conn=dconn.getConnection();
			
			
			try {
				String query="select * from edustudent where semail=?";
				
				 pst=conn.prepareStatement(query);
				pst.setString(1, email);
				ResultSet rs=pst.executeQuery();
				if(rs.next()) {
					
					String updatepassword="update edustudent set spassword=? where semail=?";
				    pst=conn.prepareStatement(updatepassword);
				    pst.setString(1, pass);
				    pst.setString(2, email);
				    int i=pst.executeUpdate();
				    if(i>0) {
				    	out.println("Password changed");
				    }
				    else {
				    	out.println("Password not changed");
				    }
				    
				}
				else {
					out.println("user not registered");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
