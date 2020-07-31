package fr.richard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller					
@RequestMapping("/hello2")		// c la route , ce que l on rentre dans l url
public class Hello2Controller {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(final ModelMap pModel) {
		
		// on passe une info a ma jsp
		pModel.addAttribute("personne","Richard");
		
		return "hello2";		// appel a la jsp hello.jsp
	}
}
