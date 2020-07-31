package com.phdareys.register.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Disconnect
 */
@WebServlet("/DisconnectController")
public class DisconnectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/index.html";      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisconnectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println ("do GEt remove Session");
       HttpSession session = request.getSession();
        session.invalidate();
		this.getServletContext().getRequestDispatcher(URL).forward( request, response );		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        System.out.println ("do Post remove Session");
		doGet(request, response);
	}

}
