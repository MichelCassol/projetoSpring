package br.edu.ifpr.bsi.projetoSpring.repository;

import java.util.List;

import br.edu.ifpr.bsi.projetoSpring.model.Aluno;

public class AlunoRepository {
	
	private List<Aluno> alunos;

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public List<Aluno> listar() {
		
		Aluno aluno1 = new Aluno();
		aluno1.setCodigo(1L);
		aluno1.setNome("João");
		aluno1.setRa("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setCodigo(2L);
		aluno2.setNome("Thiago");
		aluno2.setRa("124");
		
		Aluno aluno3 = new Aluno();
		aluno3.setCodigo(3L);
		aluno3.setNome("Marcelo");
		aluno3.setRa("125");
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		return alunos;
	}
}
