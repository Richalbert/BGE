package com.phdareys.convert.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phdareys.convert.exception.EDConvertException;
import com.phdareys.convert.model.EDConvert;

/**
 * Servlet implementation class ConvertController
 */
@WebServlet("/EDConvertController")
public class EDConvertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/EDConvert.jsp";
	private static final String LAST_RESULT = "result";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EDConvertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(URL).forward( request, response );		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String err="";
		EDConvert convObj = null;
		try {
			convObj = new EDConvert
					(Integer.parseInt(request.getParameter("eToD"))==0, 
					 Integer.parseInt(request.getParameter("amount")));
			
			convObj.run();		// traitement
			
			System.out.println (convObj);
			
				// insert last result in session for other routes
			HttpSession session = request.getSession();
			session.setAttribute( LAST_RESULT, convObj);

		} catch (EDConvertException e) {
			// TODO Auto-generated catch block
			err = e.getMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			err = "Cannot be blank!";
		} 
		request.setAttribute("error", err);
		request.setAttribute("convert", convObj);
		
		doGet(request, response);
	}

}
