package br.com.alvoradamaringa.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.lang3.StringUtils;

import br.com.alvoradamaringa.domain.Professor;
import br.com.alvoradamaringa.persistence.ProfessorDAO;

@FacesConverter(value = "professorConverter")
public class ProfessorConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
		if (StringUtils.isNotBlank(value)) {
			try {
				InitialContext ic = new InitialContext();
				ProfessorDAO professorDAO = (ProfessorDAO) ic.lookup("java:module/ProfessorDAOImpl");
				return professorDAO.findById(Long.valueOf(value));
			} catch (NamingException e) {
				return null;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
		if (value instanceof Professor) {
			Professor professor = (Professor) value;
			return professor.getIdProfessor().toString();
		}
		return StringUtils.EMPTY;
	}

}
