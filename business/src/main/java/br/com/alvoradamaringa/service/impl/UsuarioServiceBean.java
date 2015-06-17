
package br.com.alvoradamaringa.service.impl;
import br.com.alvoradamaringa.domain.usuario;
import br.com.alvoradamaringa.persistence.usuarioDAO;

public class UsuarioServiceBean implements UsuarioService {

	private usuarioDAO usuarioDAO;
	
	 @Override
	public void adicionarUsuario(Usuario usuario){
		 usuarioDAO.adicionar(usuario);	
	}
	 @Override
	public void salvarUsuario(Usuario usuario){
		 usuarioDAOsalvar(usuario);	
	}

	 @Override  
	public void excluirUsuario(Usuario usuario){
		usuarioDAO.excluir(usuario);	
	}

	 @Override   
	public void editarUsuario(Usuario usuario){
		usuarioDAO.editarr(usuario);	
	}
	 @Override   
	public void consultarUsuario(Usuario usuario) {
		usuarioDAO.consultar(usuario);	
	}
}
