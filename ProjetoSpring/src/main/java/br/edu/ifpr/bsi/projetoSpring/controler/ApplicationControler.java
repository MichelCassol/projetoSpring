package br.edu.ifpr.bsi.projetoSpring.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller  //Serve para trabalhar com jsp
//@ResponseBody  //Serve para trabalhar com qualquer tipo de front-end
@RestController //Faz tudo o que os outros fazem
@RequestMapping("/application")

public class ApplicationControler {
	
	//localhost:8080/application/testar
	@RequestMapping("/teste")
	public String teste() {
		return "Teste do framework Spring Boot com Rest";
	}
	
}
