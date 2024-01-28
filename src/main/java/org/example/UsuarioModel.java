package org.example;

public class UsuarioModel {
    //ATRIBUTOS
    private String nome;
    private String profissao;
    private int idade;

    //METODO CONSTRUTOR

    public UsuarioModel() {
        this.nome = null;
        this.profissao = null;
        this.idade = 0;

    }


    //METODOS ESPECIAIS GETTER E SETTER


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", profissao='" + profissao + '\'' +
                ", idade=" + idade +
                '}';
    }
}
