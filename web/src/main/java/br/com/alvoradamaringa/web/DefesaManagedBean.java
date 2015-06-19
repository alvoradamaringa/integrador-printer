package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.DefesaAluno;

@ViewScoped
@ManagedBean
public class DefesaManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private DefesaAluno defesa;
	
	public DefesaAluno getDefesa() {
		return defesa;
	}

	public void setDefesa(DefesaAluno defesa) {
		this.defesa = defesa;
	}

	public void cadastrarDefesa(){
		System.out.println("Cadastrando Defesa");
	}
	
	public List<DefesaAluno> getDefesas(){
		return null;
	}
}
