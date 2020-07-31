package fr.richard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.richard.model.Employe;

@Controller					
@RequestMapping("/employe")
public class EmployeController {
	
	// on recupere les info depuis /WEB-INF/dispatcher-servlet.xml
	@Autowired private Employe richard;	
	
	

	@RequestMapping(method = RequestMethod.GET)
	public String afficheEmploye(final ModelMap pModel) {
		
//		//on recupere les infos metier
//		Employe employes [] = {
//				new Employe ("Paul", "Durand", "Free", 30, 2000),
//				new Employe ("Patricia", "Duval", "Orange", 35, 3000),
//				new Employe ("Yann", "Dubois", "Sfr", 45, 3500),
//				new Employe ("Carlos", "Gohn", "nissan", 55, 350000),
//		};
//		
		
		
		
		// on cree un objet employe
		Employe e = new Employe("James","Bond","Mi6",40,3000);
		
		// traitement 
		e.run();
		
		// on passe les info a la jsp
		pModel.addAttribute("employe",e);
		pModel.addAttribute("employe",richard);
		
		return "employe";	
	}
}
