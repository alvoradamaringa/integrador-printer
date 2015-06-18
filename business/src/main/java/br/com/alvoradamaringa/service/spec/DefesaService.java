package br.com.alvoradamaringa.service.spec;


import java.sql.Date;
import java.util.List;

import br.com.alvoradamaringa.domain.DefesaAluno;
import br.com.alvoradamaringa.domain.DefesaComentario;
import br.com.alvoradamaringa.service.exceptions.*;

@Local
public interface DefesaService {
	
	public void cadastrarDefesa(DefesaAluno DefesaAluno) throws AlunoInvalidoException, BancaInvalidaException;
	
	public List<DefesaAluno> consultarDefesa(Integer idDefesaAluno, Date data, String Tema ) throws AlunoInvalidoException;
	
	public void excluirDefesa(DefesaAluno DefesaAluno) throws DefesaInvalidaException;
		
	
	public void cadastrarDefesa(DefesaComentario DefesaComentario) throws DefesaAlunoInvalidoException;
	
	public List <DefesaComentario> consultarDefesa(String comentario) throws DefesaComentarioInvalidoException;
	
	public void excluirDefesa(DefesaComentario DefesaComentario) throws DefesaInvalidaException;
	

}
