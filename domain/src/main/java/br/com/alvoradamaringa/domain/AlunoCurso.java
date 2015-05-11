
public class AlunoCurso {
    private Long idAlunoCurso;
    private Aluno aluno;
    private Curso curso;
    
     public void setId(Long idAlunoCurso){
          this.idAlunoCursoo = idAlunoCurso;
    }
    public Long getId(){
          return this.idAlunoCurso;
    }
    public void setCurso(Curso curso){
          this.curso = curso;
     }
    public Curso getCurso(){
          return this.curso;
    }
    public void setAluno(Aluno aluno){
          this.aluno = aluno;
    }
    public Aluno getAluno(){
          return this.aluno;
    }
}
