package br.com.oluizleme.escola.aplicacao.aluno.matricular;

import br.com.oluizleme.escola.dominio.aluno.Aluno;
import br.com.oluizleme.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

	private final RepositorioDeAlunos repositorio;

	public MatricularAluno(final RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}

	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
	}
}
