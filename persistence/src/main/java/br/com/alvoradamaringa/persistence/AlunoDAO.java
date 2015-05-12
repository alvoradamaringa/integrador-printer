public interface AlunoDAO extends GenericDAO<Long, Aluno>{

  public void consultar(long idAluno, pessoa idPessoa, String Ra);
}
