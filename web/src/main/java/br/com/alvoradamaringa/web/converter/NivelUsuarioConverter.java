package br.com.alvoradamaringa.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.lang3.StringUtils;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.persistence.NivelUsuarioDAO;

@FacesConverter(value = "nivelUsuarioConverter")
public class NivelUsuarioConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
		if (StringUtils.isNotBlank(value)) {
			try {
				InitialContext ic = new InitialContext();
				NivelUsuarioDAO nivelUsuarioDAO = (NivelUsuarioDAO) ic.lookup("java:module/NivelUsuarioDAOImpl");
				return nivelUsuarioDAO.findById(Long.valueOf(value));
			} catch (NamingException e) {
				return null;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
		if (value instanceof NivelUsuario) {
			NivelUsuario nivelUsuario = (NivelUsuario) value;
			return nivelUsuario.getIdNivelUsuario().toString();
		}
		return StringUtils.EMPTY;
	}

}
