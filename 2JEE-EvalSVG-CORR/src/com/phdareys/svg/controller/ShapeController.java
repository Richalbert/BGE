package com.phdareys.svg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phdareys.svg.exception.ShapeException;
import com.phdareys.svg.model.Grid;

/**
 * Servlet implementation class ShapeController
 */
@WebServlet("/ShapeController")
public class ShapeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String FORM_URL="/WEB-INF/shapeForm.jsp";
	private static final String ERROR_URL="/WEB-INF/shapeError.jsp";
	private static final String SUCCESS_URL="/WEB-INF/shapeSuccess.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShapeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(FORM_URL).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fwd = SUCCESS_URL;
		
		try {
			Grid grid = new Grid(
					Integer.parseInt(request.getParameter("linesNb")), 
					Integer.parseInt(request.getParameter("rectsNb")),
					Integer.parseInt(request.getParameter("disksNb")));
			grid.generateShapes();
			System.out.println (grid.getShapes());
			request.setAttribute("shapes", grid.getShapes());
			request.setAttribute("gridHeight", grid.getHeight());
			request.setAttribute("gridWidth", grid.getWidth());
		}
		catch (ShapeException|NumberFormatException e){   // redirection vers jsp d'erreur
			request.setAttribute("error", e.getMessage());
			fwd = ERROR_URL; 
		}
		this.getServletContext().getRequestDispatcher(fwd).forward(request, response);
	}

}
