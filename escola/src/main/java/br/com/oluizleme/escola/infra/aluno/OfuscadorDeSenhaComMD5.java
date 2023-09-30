package br.com.oluizleme.escola.infra.aluno;

import br.com.oluizleme.escola.dominio.aluno.OfuscadorDeSenha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class OfuscadorDeSenhaComMD5 implements OfuscadorDeSenha {
	@Override
	public String ofuscarSenha(String senha) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(senha.getBytes());
			byte[] bytes = md.digest();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("erro ao gerar hash da senha");
		}
	}

	@Override
	public boolean validarSenhaOfuscada(String senhaOfuscada, String senha) {
		return senhaOfuscada.equals(ofuscarSenha(senha));
	}
}
