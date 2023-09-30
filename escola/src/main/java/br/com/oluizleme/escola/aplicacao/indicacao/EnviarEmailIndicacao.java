package br.com.oluizleme.escola.aplicacao.indicacao;

import br.com.oluizleme.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

	void enviarPara(Aluno indicado);
}
