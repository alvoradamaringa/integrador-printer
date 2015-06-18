package br.com.alvoradamaringa.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.Pessoa;
@ViewScoped
@ManagedBean
public class PessoaManagedBean implements Serializable {

	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void cadastrarPessoa(){
		System.out.println("Cadastro pessoa ok");
	}
	public void cancelar(){
		System.out.println("Cancelar");
	}
}