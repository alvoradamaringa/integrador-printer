package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.alvoradamaringa.domain.NivelUsuario;

@Stateless
public class NivelUsuarioDAOImpl extends GenericDAOImpl<Long, NivelUsuario> implements NivelUsuarioDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<NivelUsuario> consultar(String descricao) {
		StringBuilder sb = new StringBuilder("SELECT u FROM NivelUsuario u ");
		if (descricao != null) {
			sb.append("WHERE u.descricao like :descricao");
		}
		Query query = entityManager.createQuery(sb.toString());
		if (descricao != null) {
			query.setParameter("descricao", descricao);
		}
		try {
			return (List<NivelUsuario>) query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

}
