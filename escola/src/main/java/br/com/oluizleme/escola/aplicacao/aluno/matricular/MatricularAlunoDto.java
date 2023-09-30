package br.com.oluizleme.escola.aplicacao.aluno.matricular;

import br.com.oluizleme.escola.dominio.aluno.Aluno;
import br.com.oluizleme.escola.dominio.aluno.FabricaDeAluno;

public class MatricularAlunoDto {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;

	public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}

	public Aluno criarAluno() {
		return new FabricaDeAluno()
				.comNomeCPFEmail(this.nomeAluno, this.cpfAluno,this.emailAluno)
				.criar();
	}
}
