package br.com.alvoradamaringa.web.converter;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.persistence.NivelUsuarioDAO;

@FacesConverter(value = "nivelUsuarioConverter")
public class NivelUsuarioConverter implements Converter {

	@EJB
	private NivelUsuarioDAO nivelUsuarioDAO;
	
	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
		if ("".equals(value) || value == null) {
			return null;
		}
		return nivelUsuarioDAO.findById(Long.valueOf(value));
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
		if (value instanceof NivelUsuario) {
			NivelUsuario nivelUsuario = (NivelUsuario) value;
			return nivelUsuario.getIdNivelUsuario().toString();
		}
		return "";
	}

}
