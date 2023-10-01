package br.com.oluizleme.escola.aplicacao.aluno.matricular;

import br.com.oluizleme.escola.dominio.aluno.Aluno;
import br.com.oluizleme.escola.dominio.aluno.CPF;
import br.com.oluizleme.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);

		MatricularAlunoDto dados = new MatricularAlunoDto(
				"Fulano",
				"123.456.789-00",
				"fulano@email.com");

		useCase.executa(dados);

		Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

		assertThat(encontrado).hasFieldOrPropertyWithValue("nome", "Fulano");
		assertThat(encontrado).hasFieldOrPropertyWithValue("cpf","123.456.789-00");
		assertThat(encontrado).hasFieldOrPropertyWithValue("email", "fulano@email.com");
	}

}