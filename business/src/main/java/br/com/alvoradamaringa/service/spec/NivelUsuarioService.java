package br.com.alvoradamaringa.service.spec;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;

@Local
public interface NivelUsuarioService {

	List<NivelUsuario> consultarNivelUsuario(String descricao);

	void salvarNivelUsuario(NivelUsuario nivelUsuario);
	
	NivelUsuario editarNivelUsuario(NivelUsuario nivelUsuario);

	void excluirNivelUsuario(NivelUsuario nivelUsuario)
			throws IntegridadeException;
}
