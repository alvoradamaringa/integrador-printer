package br.com.alvoradamaringa.service.spec;
import br.com.alvoradamaringa.domain.Curso;
public interface CursoService{

	public void cadastrarCurso(Curso curso);
	public Curso consultaCurso( String descricao);
	public void excluirCurso(Curso curso);

}
