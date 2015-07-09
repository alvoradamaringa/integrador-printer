package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.Pessoa;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.PessoaService;
import br.com.alvoradamaringa.web.util.FacesUtils;
@ViewScoped
@ManagedBean
public class PessoaManagedBean implements Serializable {

	private static final String TELA_CONSULTA = "/pessoa/ConsultaPessoa.xhtml";
	private static final String TELA_CADASTRO = "/usuario/CadastroPessoa.xhtml";
	private static final long serialVersionUID = 23L;
	private Pessoa pessoa = new Pessoa();
	private List<Pessoa> listaPessoa;
	private String nome;
	private String cpf;
	
	@EJB
	private PessoaService pessoaService;
	
	
	public void novaPessoa() {
		pessoa = new Pessoa();
		FacesUtils.redirect(TELA_CADASTRO);
	}

	public void salvarPessoa() {
		try {
			pessoaService.salvarPessoa(pessoa);
			consultarPessoa();
			FacesUtils.redirect(TELA_CONSULTA);
		} catch (Exception ex) {
			FacesUtils.redirect(TELA_CADASTRO);
		}
	}

	public void editarUsuario() {
		try {
			pessoa = pessoaService.alterarPessoa(pessoa);
			FacesUtils.redirect(TELA_CADASTRO);
		} catch (Exception ex) {
			FacesUtils.redirect(TELA_CONSULTA);
		}
	}

	public void excluirUsuario() {
		try {
			pessoaService.excluirPessoa(pessoa);
			listaPessoa = pessoaService.consultarPessoa(nome, cpf);
		} catch (IntegridadeException ex) {
			FacesUtils
					.adicionarMensagemErro("Este registro já está sendo utilizado!");
		} catch (Exception ex) {
			FacesUtils
					.adicionarMensagemErro("Erro ao excluir usuário, por favor entre em contato com o administrador!");
		}
	}

	public void consultarPessoa() {
		
		listaPessoa = pessoaService.consultarPessoa(nome, cpf);
	}

	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	public List<Pessoa> getPessoas() {
		return listaPessoa;
	}
} 
