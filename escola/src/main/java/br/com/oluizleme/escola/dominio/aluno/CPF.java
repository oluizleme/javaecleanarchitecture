package br.com.oluizleme.escola.dominio.aluno;

public class CPF {

	private String numero;

	private CPF(){}

	public CPF(String numero){
		if(numero == null ||
			!numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")){
			throw new IllegalArgumentException("CPF inválido!");
		}
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}
}
