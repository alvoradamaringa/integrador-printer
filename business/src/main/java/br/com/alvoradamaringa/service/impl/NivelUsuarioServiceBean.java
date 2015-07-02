package br.com.alvoradamaringa.service.impl;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.persistence.NivelUsuarioDAO;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.NivelUsuarioService;
import java.util.List;
import javax.ejb.Stateless;

public class NivelUsuarioServiceBean implements NivelUsuarioService {

     @Override
    public List<NivelUsuario> salvarNivelUsuario(String descricao) {

    nivelUsuarioDAO.salvar(nivelUsuario);
        if (nivelUsuario == null) {
            salvarNivelUsuario(nivelUsuario);
       } 
  }

    @EJB
    private NivelUsuarioDAO nivelUsuarioDAO;

    @Override
    public void consultarNivelUsuario(NivelUsuario nivelUsuario) {
        nivelUsuarioDAO.consultar((NivelUsuario) nivelUsuarioDAO);
        return (List<NivelUsuario>) nivelUsuarioDAO;
        }
    }

    @Override
    public void excluirNivelUsuario(NivelUsuario nivelUsuario){
        nivelUsuarioDAO.deletar(nivelUsuario);
        if (nivelUsuario == null) {
            nivelUsuarioDAO.deletar(nivelUsuario);
            
        }
            throws IntegridadeException;
    }

}
