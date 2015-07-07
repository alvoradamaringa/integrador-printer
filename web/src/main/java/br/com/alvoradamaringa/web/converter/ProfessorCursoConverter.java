package br.com.alvoradamaringa.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.lang3.StringUtils;

import br.com.alvoradamaringa.domain.ProfessorCurso;
import br.com.alvoradamaringa.persistence.ProfessorCursoDAO;

@FacesConverter(value = "professorCursoConverter")
public class ProfessorCursoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
		if (StringUtils.isNotBlank(value)) {
			try {
				InitialContext ic = new InitialContext();
				ProfessorCursoDAO professorCursoDAO = (ProfessorCursoDAO) ic.lookup("java:module/ProfessorCursoDAOImpl");
				return professorCursoDAO.findById(Long.valueOf(value));
			} catch (NamingException e) {
				return null;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
		if (value instanceof ProfessorCurso) {
			ProfessorCurso professorCurso = (ProfessorCurso) value;
			return professorCurso.getIdProfessorCurso().toString();
		}
		return StringUtils.EMPTY;
	}

}
