package br.com.alvoradamaringa.domain;

import java.io.Serializable;
import javax.swing.text.html.parser.Entity;

/**
 *
 * @author Pedro
 */
@Entity
public class TipoProfessor implements Serializable {

	private static final long serialVersionUID = 23L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TipoProfessor")
	private Long idTipoProfessor;
	private String Orientador;
	private String Convidado;
    private Object GenerationType;

	public Long getTipoProfessor() {
		return idTipoProfessor;
	}

	public void setIdTipoProfessor(Long idTipoProfessor) {
		this.idTipoProfessor = idTipoProfessor;
	}

	public void setOrientador(String Orientador) {
		this.Orientador = Orientador;
	}

	public String getOrientador() {
		return this.Orientador;
	}

	public void setConvidado(String Convidado) {
		this.Convidado = Convidado;
	}

	public String getConvidado() {
		return this.Convidado;
	}
}
