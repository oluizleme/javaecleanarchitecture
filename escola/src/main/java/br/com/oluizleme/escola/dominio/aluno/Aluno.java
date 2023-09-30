package br.com.oluizleme.escola.dominio.aluno;

import java.util.List;

public class Aluno {

	private CPF cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones = List.of();

	private Aluno(){}

	public Aluno(CPF cpf, String nome, Email email) {
		if(nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome é obrigatório!");
		}
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero){
		this.telefones.add(new Telefone(ddd, numero));
	}

	public CPF getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Email getEmail() {
		return email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}
}
