package fr.richard.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.richard.beans.Auteur;
import fr.richard.forms.ConnectionForm;

/*
 * le controller est gere par une servlet en JEE
 */

@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    
    public Test() {
        super();
    }

	/*
	 * avec HTTP il y a 2 methodes de communications avec le serveurs : GET / POST
	 * get pour recuperer une page du serveur
	 * post pour envoyer des infos de formulaire au serveur
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
//		String name = request.getParameter("name");
//		request.setAttribute("name", name);
//		
//		String [] noms = { "Mathiei", "Robert", "Richard" };
//		request.setAttribute( "noms", noms);
//		
//		
//		String message = "Au revoir !";	
//		request.setAttribute("variable", message);
		
//		Auteur auteur = new Auteur();
//		auteur.setPrenom("Richard");
//		auteur.setNom("Ben");
//		auteur.setActif(true);
//		System.out.println(auteur);
//		request.setAttribute("auteur", auteur);

	
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		ConnectionForm form = new ConnectionForm();
		form.verifierIdentifiants(request);
		
		request.setAttribute("form", form);
		
		//on bascule sur la jsp avec le nom en forward
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
		
	}

}
