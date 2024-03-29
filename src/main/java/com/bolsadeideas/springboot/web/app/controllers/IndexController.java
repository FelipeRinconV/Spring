package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

	
	/**
	 * el value es la ruta
	 * metodo tipo de peticion
	 * para mapear varias ruta {"index","ruta2",...}
	 * @return la pagina html que va mostrar
	 */
	@GetMapping(value = "/index")
	public String index(Model model) {
		
		
		model.addAttribute("titulo", "Hola spring framework");
		
		
		return "index";
	}
}
