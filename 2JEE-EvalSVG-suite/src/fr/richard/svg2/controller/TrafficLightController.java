package fr.richard.svg2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.richard.svg2.exception.ShapeException;
import fr.richard.svg2.model.Disk;
import fr.richard.svg2.model.Grid;
import fr.richard.svg2.model.Rect;
import fr.richard.svg2.model.Shape;


@WebServlet("/TrafficLightController")
public class TrafficLightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS_URL="/WEB-INF/shapeSuccess.jsp";
	private static final String ERROR_URL="/WEB-INF/shapeError.jsp";
    
    public TrafficLightController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fwd = SUCCESS_URL;
		
		Shape []  trafficLight = {
				new Rect(20, 30, "black", "black", 1, 0.5f, 200, 100), 
				new Disk(70, 70, "black", "red", 1, 0.5f, 25),
				new Disk(70, 130, "orange", "orange", 1,  0.5f, 25),
				new Disk(70, 190, "black", "green", 1,  0.5f, 25),
				};
		
		
			Grid grid = new Grid(trafficLight);
			//grid.generateShapes();
			System.out.println (grid.getShapes());
			request.setAttribute("shapes", grid.getShapes());
			request.setAttribute("gridHeight", grid.getHeight());
			request.setAttribute("gridWidth", grid.getWidth());
	
		
		
		this.getServletContext().getRequestDispatcher(fwd).forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
