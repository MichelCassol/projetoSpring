package br.edu.ifpr.bsi.projetoSpring.controler;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpr.bsi.projetoSpring.model.Aluno;
import br.edu.ifpr.bsi.projetoSpring.repository.AlunoRepository;

@RestController
//http://127.0.0.1:8080/aluno

@RequestMapping("/aluno")
//GetMapping
//REST = Protocolo HTTP -> Métodos: GET, POST, PUT...

public class AlunoControler {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Aluno> listar(){
		AlunoRepository ar = new AlunoRepository();
		return ar.listar();
	}
}
