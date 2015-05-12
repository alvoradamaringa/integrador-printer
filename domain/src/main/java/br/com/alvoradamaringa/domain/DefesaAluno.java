package br.com.alvoradamaringa.domain;

import java.math.BigDecimal;
import java.util.Date;

public class DefesaAluno extends DefesaAlunoDAOImpl {

    private Long idDefesaAluno;
    private Aluno aluno;
    private PesquisaTipoTcc pesquisaTipoTcc;
    private BigDecimal nota;
    private Date data;
    private Status status;
    private String tema;

}
