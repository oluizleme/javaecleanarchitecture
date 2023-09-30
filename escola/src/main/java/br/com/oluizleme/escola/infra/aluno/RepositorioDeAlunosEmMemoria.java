package br.com.oluizleme.escola.infra.aluno;

import br.com.oluizleme.escola.dominio.aluno.Aluno;
import br.com.oluizleme.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.oluizleme.escola.dominio.aluno.CPF;
import br.com.oluizleme.escola.dominio.aluno.RepositorioDeAlunos;

import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	private List<Aluno> matriculados = List.of();
	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		return this.matriculados.stream()
				.filter(a-> a.getCpf().equals(cpf.getNumero()))
				.findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}
}