package br.com.oluizleme.escola.dominio.aluno;

public interface OfuscadorDeSenha {

	String ofuscarSenha(String senha);
	boolean validarSenhaOfuscada(String senhaOfuscada, String senha);
}
