package br.com.oluizleme.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class AlunoTest {

	@Test
	void naoDeveCriarUmAlunoComNomeInvalido() {
		assertThrows(IllegalArgumentException.class,
				() -> new Aluno(new CPF("123.456.789-00"), null, new Email("tony@stark.com")));

		assertThrows(IllegalArgumentException.class,
				() -> new Aluno(new CPF("123.456.789-00"), "", new Email("tony@stark.com")));
	}

	@Test
	void naoDeveCriarUmAlunoComCPFComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new Aluno(new CPF(null), "Tony Stark", new Email("tony@stark.com")));

		assertThrows(IllegalArgumentException.class,
				() -> new Aluno(new CPF(""), "Tony Stark", new Email("tony@stark.com")));

		assertThrows(IllegalArgumentException.class,
				() -> new Aluno(new CPF("12345678900"), "Tony Stark", new Email("tony@stark.com")));
	}

	@Test
	void naoDeveCriarUmAlunoComEmailInvalido() {
		assertThrows(IllegalArgumentException.class,
				() -> new Aluno(new CPF("123.456.789-00"), "Tony Stark", new Email(null)));

		assertThrows(IllegalArgumentException.class,
				() -> new Aluno(new CPF("123.456.789-00"), "Tony Stark", new Email("")));

		assertThrows(IllegalArgumentException.class,
				() -> new Aluno(new CPF("123.456.789-00"),"Tony Stark", new Email("emailInvalido")));
	}


	@Test
	void deveCriarUmAlunoComOsDadosValidos() {
		var nome = "Tony Stark";
		var numeroDoCpf = "123.456.789-00";
		var  endereco = "tony.stark@stark.com";
		var cpf = new CPF(numeroDoCpf);
		var email = new Email(endereco);
		var aluno = new Aluno(cpf,nome,email);

		assertThat(aluno).hasFieldOrPropertyWithValue("nome", nome);
		assertThat(aluno).hasFieldOrPropertyWithValue("cpf", cpf);
		assertThat(aluno).hasFieldOrPropertyWithValue("email", email);
	}
}