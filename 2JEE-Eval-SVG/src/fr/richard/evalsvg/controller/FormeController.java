package fr.richard.evalsvg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.richard.evalsvg.model.Forme;
import fr.richard.evalsvg.model.Ligne;
import fr.richard.evalsvg.model.Lignes;


@WebServlet("/FormeController")
public class FormeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/AffichageLigne.jsp";
	
	private static final int MIN = 1;
	private static final int MAX = 500;
    
    public FormeController() { }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		int x1 = randomInt();
//		int y1 = randomInt();
//		int x2 = randomInt();
//		int y2 = randomInt();
//
//		String couleur="yellow";
//		
//		Forme ligne1 = new Ligne(x1,y1,x2,y2,couleur);
//		System.out.println(ligne1);
//		
//		request.setAttribute("ligne1", ligne1);
		

		this.getServletContext().getRequestDispatcher(URL).forward( request, response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		int nbLigne = Integer.parseInt( request.getParameter("nbLigne") );
		System.out.println(nbLigne);
		
		// on cree un tableau de nbLigne
		Lignes lignes = new Lignes(nbLigne);
		System.out.println(lignes);
		
		request.setAttribute("nbLigne",nbLigne);
		
		Forme ligne1 = null;
		Forme ligne2 = null;
		Forme ligne3 = null;
		Forme ligne4 = null;
		Forme ligne5 = null;
		Forme ligne6 = null;
		Forme ligne7 = null;
		Forme ligne8 = null;
		Forme ligne9 = null;
		Forme ligne10 = null;
		
		String couleur="yellow";
		switch (nbLigne) {
		case 1:
			ligne1 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne1", ligne1);
			break;
		case 2:
			ligne1 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne1", ligne1);
			ligne2 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne2", ligne2);
			break;
		case 3:
			ligne1 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne1", ligne1);
			ligne2 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne2", ligne2);
			ligne3 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne3", ligne3);
			break;
		case 4:
			ligne1 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne1", ligne1);
			ligne2 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne2", ligne2);
			ligne3 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne3", ligne3);
			ligne4 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne4", ligne4);
			break;
		case 5:
			ligne1 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne1", ligne1);
			ligne2 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne2", ligne2);
			ligne3 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne3", ligne3);
			ligne4 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne4", ligne4);
			ligne5 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne5", ligne5);
			break;
		case 6:
			ligne1 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne1", ligne1);
			ligne2 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne2", ligne2);
			ligne3 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne3", ligne3);
			ligne4 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne4", ligne4);
			ligne5 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne5", ligne5);
			ligne6 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne6", ligne6);
			break;
		case 7:
			ligne1 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne1", ligne1);
			ligne2 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne2", ligne2);
			ligne3 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne3", ligne3);
			ligne4 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne4", ligne4);
			ligne5 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne5", ligne5);
			ligne6 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne6", ligne6);
			ligne7 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne7", ligne7);
			break;
		case 8:
			ligne1 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne1", ligne1);
			ligne2 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne2", ligne2);
			ligne3 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne3", ligne3);
			ligne4 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne4", ligne4);
			ligne5 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne5", ligne5);
			ligne6 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne6", ligne6);
			ligne7 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne7", ligne7);
			request.setAttribute("ligne8", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			break;
		case 9:
			ligne1 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne1", ligne1);
			ligne2 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne2", ligne2);
			ligne3 = new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur);
			request.setAttribute("ligne3", ligne3);
			request.setAttribute("ligne4", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne5", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne6", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne7", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne8", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne9", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			break;
		case 10:
			request.setAttribute("ligne1", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne2", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne3", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne4", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));		
			request.setAttribute("ligne5", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne6", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne7", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne8", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne9", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
			request.setAttribute("ligne10", new Ligne(randomInt(),randomInt(),randomInt(),randomInt(),couleur));
		default:
			break;
		}
		
		
		
//		String[] str = null ;
//		for (int i=0; i<nbLigne; i++) {
//			str[i] = "ligne" + i;
//			
//			request.setAttribute( str[i], lignes.getLignes() );
//		}
//		
//		
		
//		//request.setAttribute("lignes", lignes);
		
		doGet(request, response);
		
	}
		

	private int randomInt()	{
	    return (int) (Math.random()*(MAX-MIN+1))+MIN;
	}


}
