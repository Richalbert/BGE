package fr.richard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.richard.model.Person;

@Controller
@RequestMapping("hello/{nom}/{prenom}")
public class UrlPropreController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String display(final ModelMap pModel, 
		@PathVariable(value="nom") final String nom,
		@PathVariable(value="prenom") final String prenom
		) {
		
		
		pModel.addAttribute("personne",	new Person(nom,prenom) );
		return "urlpropre";
		
	}
	
}
