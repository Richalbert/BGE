package com.phdareys.register.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phdareys.register.form.RegisterForm;

/**
 * Servlet implementation class Register
 */
@WebServlet("/RegisterControllerPlus")
public class RegisterControllerPlus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/Register.jsp";
	private static final String URL_OK = "/WEB-INF/RegisterOk.jsp";
	private static final String URL_ERR = "/WEB-INF/RegisterErr.jsp";
    public static final String ATT_SESSION_USER = "userSession";
    public static final String ATT_SESSION_USERLIST = "userSessionList";
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterControllerPlus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// redirection vers une jsp formulaire vide
		this.getServletContext().getRequestDispatcher(URL).forward( request, response );		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = URL;	// url de réaffichage par défaut
		try {				// analyse infos user
			RegisterForm regF = new RegisterForm(request);
			if (regF.getErrors().size() == 0) {
					// pas d'erreur : traitement (insertion bd par exemple?)
					url = URL_OK;
			}
				// on passe les erreurs personnalisées
			request.setAttribute("errors", regF.getErrors());
				// on passe l'objet métier pour soit réafficher soit continuer
			request.setAttribute("user", regF.getUser());
	        	// Récupération de la session depuis la requête 
	        HttpSession session = request.getSession();
	        
	        	// mémorisation de tous les noms de user
	         ArrayList<String> aLUsers = (ArrayList<String>) session.getAttribute(ATT_SESSION_USER);
	        if (aLUsers == null)
	        	aLUsers = new ArrayList<String>();
	        if (regF.getErrors().isEmpty() && regF.getUser().getName().length() !=0) {
	        	aLUsers.add(regF.getUser().getName());
	        	session.setAttribute(ATT_SESSION_USER, aLUsers);
	        	
	        	for (String u:aLUsers)
	        		System.out.println ("user: "+u);
	        }
	        
	        if ( session.getAttribute(ATT_SESSION_USER)!= null) {
	        	session.invalidate(); // déja connecté, je déconnecte
		        System.out.println ("remove User Session");
	        }
	        else {// ajout du bean Utilisateur à la session
	        	
	        	session.setAttribute( ATT_SESSION_USER, 
	            		regF.getErrors().isEmpty() ? 
	            				regF.getUser() : null );
		        System.out.println ("add user Session");
	        }
		} catch (Exception e) {	// dysfonctionnement
			url = URL_ERR;
		}	// redirection vers la bonne url
		this.getServletContext().getRequestDispatcher(url).forward( request, response );		
	}

}
