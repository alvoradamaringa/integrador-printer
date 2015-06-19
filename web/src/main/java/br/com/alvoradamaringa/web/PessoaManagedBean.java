package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.Pessoa;
@ViewScoped
@ManagedBean
public class PessoaManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void CadastrarPessoa(){
		System.out.println("Cadastro pessoa ok");
	}
	
	public List<Pessoa> getPessoas() {
		return null;
	}
} 