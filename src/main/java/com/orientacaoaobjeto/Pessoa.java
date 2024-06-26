package com.orientacaoaobjeto;

import java.util.Date;

public class Pessoa {
    private String nome;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    private Date dataDeNascimento;
    private String sexo;

    void mudarNome(String novoNome){
        nome = novoNome;
    }
    void casar(String antigoSobrenome, String novoSobrenome) {
        nome = nome.replace(antigoSobrenome, novoSobrenome);
    }
}
