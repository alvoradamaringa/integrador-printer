package br.com.alvoradamaringa.domain;
@Entity
@Table(name="PROFESSOR_CURSO")
public class ProfessorCurso {
    
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROFESSOR_CURSO")
        private Long idProfessorCurso;
        
        @ManyToOne
        @JoinColumn(name = "ID_CURSO")
	private Curso curso;
        
        @ManyToOne
        @JoinColumn(name = "ID_PROFESSOR")
	private Professor professor;
	
	public void adicionarProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void adicionarCurso(Curso curso) {
		this.curso = curso;
	}
		
	public Long getIdProfessorCurso(){
		return idProfessorCurso;
	}
	
	public Curso getCurso(){
		return curso;
	}
	
	public Professor getProfessor(){
		return professor;
	}
	
}
