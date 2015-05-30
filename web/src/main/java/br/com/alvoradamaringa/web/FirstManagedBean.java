package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean

public class FirstManagedBean implements Serializable {

	private Date data = new Date();
	
	public Date getData() {
		return data;
	}
}
