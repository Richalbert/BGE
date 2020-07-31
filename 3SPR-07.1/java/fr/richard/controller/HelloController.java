package fr.richard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller					// la servlet devient un controller, on dit c un controller
@RequestMapping("/hello")	// c la route , ce que l on met dans le navigateur
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(final ModelMap pModel) {
		
		// on passe une info a ma jsp
		pModel.addAttribute("personne","Richard");
		
		return "hello";		// appel a la jsp hello.jsp
	}
	

}






