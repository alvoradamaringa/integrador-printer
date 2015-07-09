package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.PesquisaTipoTcc;
import br.com.alvoradamaringa.service.spec.PesquisaTipoTccService;
import br.com.alvoradamaringa.web.util.FacesUtils;

@ViewScoped
@ManagedBean
public class TipoTccManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private PesquisaTipoTcc pesquisaTipoTcc;
	private List<PesquisaTipoTcc> listaPesquisaTipoTcc;
	private String descricao;
	
	@EJB
	private PesquisaTipoTccService pesquisaTipoTccService;
	
	@PostConstruct
	void init() {
		descricao = null;
		listaPesquisaTipoTcc = pesquisaTipoTccService.consultarPesquisaTipoTcc(null);
	}
	
	public PesquisaTipoTcc getPesquisaTipoTcc() {
		return pesquisaTipoTcc;
	}

	public void setPesquisaTipoTcc(PesquisaTipoTcc pesquisaTipoTcc) {
		this.pesquisaTipoTcc = pesquisaTipoTcc;
	}

	public void CadastrarTipoTcc(){
		pesquisaTipoTccService.salvarPesquisaTipoTcc(pesquisaTipoTcc);
		FacesUtils.redirect("/tipotcc/ConsultaTipoTCC.xhtml");
	}
	
	public List<PesquisaTipoTcc> getPesquisaTipoTccs(){
		return null;
	}

	public PesquisaTipoTccService getPesquisaTipoTccService() {
		return pesquisaTipoTccService;
	}

	public void setPesquisaTipoTccService(PesquisaTipoTccService pesquisaTipoTccService) {
		this.pesquisaTipoTccService = pesquisaTipoTccService;
	}
	
	public void consultarTipoTcc() {
		setListaPesquisaTipoTcc(pesquisaTipoTccService.consultarPesquisaTipoTcc(descricao));
	}
	
	public void menu() {
		consultarTipoTcc();
		FacesUtils.redirect("/tipotcc/ConsultaTipoTCC.xhtml");
	}

	public List<PesquisaTipoTcc> getListaPesquisaTipoTcc() {
		return listaPesquisaTipoTcc;
	}

	public void setListaPesquisaTipoTcc(List<PesquisaTipoTcc> listaPesquisaTipoTcc) {
		this.listaPesquisaTipoTcc = listaPesquisaTipoTcc;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}