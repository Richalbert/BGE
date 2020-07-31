package fr.richard.svg2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.richard.svg2.exception.ShapeException;
import fr.richard.svg2.model.Grid;
import fr.richard.svg2.model.Rect;
import fr.richard.svg2.model.Shape;

/**
 * Servlet implementation class FrenchFlagController
 */
@WebServlet("/FrenchFlagController")
public class FrenchFlagController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS_URL="/WEB-INF/shapeSuccess.jsp";
	private static final String ERROR_URL="/WEB-INF/shapeError.jsp";
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrenchFlagController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fwd = SUCCESS_URL;
		Shape []  frCols = {
				new Rect(20, 30, "blue", "blue", 1, 0.5f, 200, 100), 
				new Rect(120, 30, "white", "white", 1, 0.5f, 200, 100),
				new Rect(220, 30, "red", "red", 1, 0.5f, 200, 100),
				};
		
		try {
			Grid grid = new Grid(frCols);
			grid.generateShapes();
			System.out.println (grid.getShapes());
			request.setAttribute("shapes", grid.getShapes());
			request.setAttribute("gridHeight", grid.getHeight());
			request.setAttribute("gridWidth", grid.getWidth());
		}
		catch (ShapeException e){   // redirection vers jsp d'erreur
			request.setAttribute("error", e.getMessage());
			fwd = ERROR_URL; 
		}
		this.getServletContext().getRequestDispatcher(fwd).forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
