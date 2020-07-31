package fr.richard.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * request : donne qui arrive du navigateur vers le serveur tomcat
	 * response: la reponse du serveur tomcat au navigateur
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		
		if ( login == null ) login = "";
		if ( password == null ) password = "";
		
		
		HttpSession session = request.getSession( true );
		session.setAttribute("login", login);
		session.setAttribute("password", password);
		
		request.getRequestDispatcher( "/Login.jsp" ).forward( request,  response );
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		
		HttpSession session = request.getSession( true );
		session.setAttribute("login", login);
		session.setAttribute("password", password);
		
		System.out.println( "in the doPost " + login + " - " + password);
		
		if ( login.contentEquals( "bond" ) && password.contentEquals( "007" ) ) {
			request.getRequestDispatcher( "/Connected.jsp" ).forward( request,  response );
			session.setAttribute("isConnected", true);
		} else {
			request.getRequestDispatcher( "/Login.jsp" ).forward( request,  response );
			session.setAttribute("isConnected", false);
		}	                                                                            
		
	}

}
