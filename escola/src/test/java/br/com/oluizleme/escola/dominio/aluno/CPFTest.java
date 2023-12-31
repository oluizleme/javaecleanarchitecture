package br.com.oluizleme.escola.dominio.aluno;

import br.com.oluizleme.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

	@Test
	void naoDeveriaCriarCPFComNumerosInvalidos(){
		assertThrows(IllegalArgumentException.class,
				() -> new CPF(null));

		assertThrows(IllegalArgumentException.class,
				() -> new CPF(""));

		assertThrows(IllegalArgumentException.class,
				() -> new CPF("12345678900"));
	}

	@Test
	void deveriaPermitirCriarCPFComNumeroValido() {
		String numero = "123.456.789-00";
		CPF cpf = new CPF(numero);
		assertEquals(numero,cpf.getNumero());
	}

}