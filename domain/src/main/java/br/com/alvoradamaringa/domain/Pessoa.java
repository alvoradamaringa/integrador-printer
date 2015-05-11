package br.com.alvoradamaringa.domain;

import java.util.Date;

public class Pessoa {
    
    private Long idPessoa;
    private String nome;
    private String cpf;
    private String endereco;
    private enum sexo{M,F};
    private String telefone;
    private String email;
    private Date dataNascimento;
    
    public void setId(Long idPessoa){
        this.idPessoa = idPessoa;
    }
    
    public Long getId(){
        return this.idPessoa;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return this.endereco;       
    }
    
    public void setSexo(enum sexo){
        this.sexo = sexo;
    }
    
    public enum getSexo(){
        return this.sexo;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public Date getDataNascimento(){
        return this.dataNascimento;
    }
}
