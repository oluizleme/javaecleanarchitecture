package br.com.oluizleme.escola.dominio.indicacao;

import br.com.oluizleme.escola.dominio.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {

	private Aluno indicado;
	private Aluno indicante;
	private LocalDateTime dataIndicacao;

	private Indicacao() {}

	public Indicacao(Aluno indicado, Aluno indicante){
		this.indicado = indicado;
		this.indicante = indicante;
		this.dataIndicacao = LocalDateTime.now();
	}

	public Aluno getIndicado() {
		return indicado;
	}

	public Aluno getIndicante() {
		return indicante;
	}

	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}
}
