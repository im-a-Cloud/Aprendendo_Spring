package com.Alvaro.SpringAprendendo.Pessoa;

import java.time.LocalDate;

public class Pessoa {
    private long id;
    private String nome;
    private String email;
    private int idade;
    private String ocupacao;
    private LocalDate dataNascimento;


    public Pessoa(long id, String nome, String email, int idade, String ocupacao, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.ocupacao = ocupacao;
        this.dataNascimento = dataNascimento;
    }
    public Pessoa(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
