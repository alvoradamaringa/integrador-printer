package br.com.alvoradamaringa.domain;

public class Curso {
     private long idCurso;
     private String descricao;
     
     public void setId(Integer idcurso){
          this.idcurso=idcurso;
     }
     public void setDescricao(String descricao){
          this.descricao=descricao;
     }
     public Integer getId(Integer idcurso){
          return this.idcurso;
     }
     public String getdescricao(String descricao){
          return this.descricao;
     }
     
}
