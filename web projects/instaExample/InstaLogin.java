

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InstaLogin
 */
@WebServlet("/InstaLogin")
public class InstaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InstaLogin()  {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().print("");
		PrintWriter out = response.getWriter();
		
		  String Adminname="aravindh";
		  String Adminpassword= "aarvy7";
		  String strname=request.getParameter("uname"); 
		  String strpwd=request.getParameter("pwd"); 
		  String strlogin=request.getParameter("submit"); 
		  
		  if(Adminname.equals(strname)){
			  if(Adminpassword.equals(strpwd)){
				  out.print(" <br> ");
				  out.print("Login successfull :)");
			  }else{out.print("incorect password");
			        out.print("<br>");
			        out.print("please check your password");
			        out.print("<br>");
			        out.print("forget password?");
				  
			  }
		  }else{
			  out.print("enter a valid username");
		  }
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
