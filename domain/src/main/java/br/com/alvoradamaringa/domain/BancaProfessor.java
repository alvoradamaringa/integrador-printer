package br.com.alvoradamaringa.domain;

package br.com.alvoradamaringa.domain;

@Entity
@Table(name="BANCA_PROFESSOR")
public class BancaProfessor {

        @Id  
        @GeneratedValeu(strategy = GenerationType.IDENTITY) 
	private Long idBancaProfessor;
	


        @ManyToOne
	@JoinColumn(name = "ID_DEFESAALUNO")
	private DefesaAluno defesaAluno;
        



        @ManyToOne
	@JoinColumn(name = "ID_PROFESSOR")
	private Professor professor;       

 
        
        @ManyToOne
	@JoinColumn(name = "ID_TIPOPROFESSOR")
	private TipoProfessor tipoProfessor;
	



	public void adicionarProfessor(Professor professor, TipoProfessor tipoProfessor) {
		this.professor = professor;
		this.tipoProfessor = tipoProfessor;
	}
	
	public void adicionarDefesaAluno(DefesaAluno defesaAluno) {
		this.defesaAluno = defesaAluno;
	}


         
	public Long getIdBancaProfessor() {
		return idBancaProfessor;
	}


	public Professor getProfessor() {
	
	return professor;
	}

	public DefesaAluno getDefesaAluno() {
		return defesaAluno;
	}

	public TipoProfessor getTipoProfessor() {
		return tipoProfessor;
	}

}