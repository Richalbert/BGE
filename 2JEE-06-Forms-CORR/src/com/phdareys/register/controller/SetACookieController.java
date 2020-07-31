package com.phdareys.register.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetACookie
 */
@WebServlet("/SetACookieController")
public class SetACookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/CheckCookie.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetACookieController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myCookieVal= null;
		if (request.getParameter("set") != null) {
			// sets a cookie
			myCookieVal = Integer.toString(request.getServerPort());
			Cookie cookie = new Cookie( "MyCookie", myCookieVal );
		    cookie.setMaxAge(600);	// 10 mns
		    response.addCookie( cookie );
		}
		if (request.getParameter("unset") != null) {
			// unsets a cookie
			Cookie cookie = new Cookie( "MyCookie", "fake" );
		    cookie.setMaxAge(0);	// kill it
		    response.addCookie( cookie );
		}
		if (request.getParameter("check") != null) {
			Cookie[] cookies = request.getCookies();
			if ( cookies != null ) {
				for ( Cookie cookie : cookies ) {
					if ( cookie != null && "MyCookie".equals( cookie.getName() ) ) {
						myCookieVal =  cookie.getValue();
			        }
			    }
			}	
		}
		request.setAttribute("myCookie", myCookieVal);
		this.getServletContext().getRequestDispatcher(URL).forward( request, response );		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
