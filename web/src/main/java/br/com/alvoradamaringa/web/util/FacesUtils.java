package br.com.alvoradamaringa.web.util;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class FacesUtils {
	
	private FacesUtils() {
	}

	public static void adicionarMensagemErro(String mensagem) {
		adicionarMensagem(null, mensagem, FacesMessage.SEVERITY_ERROR);
	}
	
	public static void adicionarMensagemErro(String componentId, String mensagem) {
		adicionarMensagem(componentId, mensagem, FacesMessage.SEVERITY_ERROR);
	}
	
	public static void adicionarMensagemSucesso(String mensagem) {
		adicionarMensagem(null, mensagem, FacesMessage.SEVERITY_INFO);
	}
	
	public static void adicionarMensagemSucesso(String componentId, String mensagem) {
		adicionarMensagem(componentId, mensagem, FacesMessage.SEVERITY_INFO);
	}

	private static void adicionarMensagem(String componentId, String mensagem, Severity severity) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		FacesMessage facesMessage = new FacesMessage(severity, mensagem, mensagem);
		facesContext.addMessage(componentId, facesMessage);
	}
	
	public static void cleanSubmittedValues(UIComponent component) {
		if (component instanceof EditableValueHolder) {
			EditableValueHolder evh = (EditableValueHolder) component;
			evh.setSubmittedValue(null);
			evh.setValue(null);
			evh.setLocalValueSet(false);
			evh.setValid(true);
		}
		if(component.getChildCount() > 0){
			for (UIComponent child : component.getChildren()) {
				cleanSubmittedValues(child);
			}
		}
	}
	
	public static void cleanSubmittedValues(String componentName) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		UIComponent component = facesContext.getViewRoot().findComponent(componentName);
		if (component != null) {
			cleanSubmittedValues(component);
		}
	}

	public static void redirect(String url) {
		try {
			FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.getExternalContext().redirect(url);
		} catch (IOException e) {
			throw new IllegalArgumentException("URL invalid: " + url);
		}
	}
	
}