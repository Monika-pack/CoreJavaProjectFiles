package delete;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//public class DeleteServlet {
/**
 * Servlet implementation class DeleteData
 */
@WebServlet("/DeleteData")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn=null;
	Statement st=null;
	private String semail;
	
	

    /**
     * Default constructor. 
     */
    public DeleteServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		semail = request.getParameter("semail");
		
		DbConnect dconn=new DbConnect();
		conn=dconn.getConnection();
		try {
			response.setContentType("text/html");
			String query="select * from edustudent  where semail='"+semail+"'";
			
			ResultSet rs=st.executeQuery(query);
			
			if(rs.next()) {
				
				*
				String sql="Delete  from edustudent where semail='"+semail+"'";
			   System.out.println(sql);
				int i=st.executeUpdate(sql);
			    if(i>0) {
			    	out.println("Deleted");
			    }
			    else {
			    	out.println("Failed to delete");
			    }
			    
			}
			else {
				out.println("Record Not present");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


