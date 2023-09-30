package br.com.oluizleme.escola.infra.indicacao;

import br.com.oluizleme.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.oluizleme.escola.dominio.aluno.Aluno;

public class EnviarEmailDeIndicacaoComJavaMail implements EnviarEmailIndicacao {
	@Override
	public void enviarPara(Aluno indicado) {
		System.out.println("Bem-vindo " + indicado.getNome());
	}
}
