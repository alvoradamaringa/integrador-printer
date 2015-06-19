package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.PesquisaTipoTcc;

@ViewScoped
@ManagedBean
public class TipoTccManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private PesquisaTipoTcc pesquisaTipoTcc;
	
	public PesquisaTipoTcc getPesquisaTipoTcc() {
		return pesquisaTipoTcc;
	}

	public void setPesquisaTipoTcc(PesquisaTipoTcc pesquisaTipoTcc) {
		this.pesquisaTipoTcc = pesquisaTipoTcc;
	}

	public void CadastrarPesquisaTipoTcc(){
		System.out.println("Cadastrando PesquisaTipoTcc");
	}
	
	public List<PesquisaTipoTcc> getPesquisaTipoTccs(){
		return null;
	}
}
