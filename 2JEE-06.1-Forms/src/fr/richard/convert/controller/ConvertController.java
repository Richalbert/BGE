package fr.richard.convert.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.richard.controller.form.ConvertForm;
import fr.richard.convert.bean.Convert;


@WebServlet("/ConvertController")
public class ConvertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/Convert.jsp";
       
    
    public ConvertController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// on affiche le formulaire vierge
		this.getServletContext().getRequestDispatcher(URL).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		try {
//			Convert convert = new Convert( 100, false);
//			System.out.println("Resultat " + convert);
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		
		
		// on recupere les infos du formulaire et on met a jour l'objet metier
		ConvertForm convertForm;
		try {
			convertForm = new ConvertForm(request);
			
			
			System.out.println(request.getAttribute("inAmount"));
			System.out.println(request.getAttribute("outAmount"));
			
			
			
			// on passe les erreurs personnalisées
			request.setAttribute("errors", convertForm.getErrors());
		
			// on passe l'objet métier pour soit réafficher soit continuer
			request.setAttribute("convert", convertForm.getConvert());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		this.getServletContext().getRequestDispatcher(URL).forward( request, response );		
		
	}

}
