package br.com.alvoradamaringa.service.spec;

import br.com.alvoradamaringa.domain.Usuario;

public interface UsuarioService {

	public void consultarUsuario(String nome, String NivelUsuario);

	public void editarUsuario(Usuario usuario);

	public void excluirUsuario(Usuario usuario);

}
