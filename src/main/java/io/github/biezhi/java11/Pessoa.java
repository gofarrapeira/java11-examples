package io.github.biezhi.java11;

public class Pessoa{
    protected String nome;
    protected int idade;
    protected char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade=i;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setSexo(char s){
        this.sexo=s;
    }

    public void ganharExperiencia(){

    }

    @Override
    public String toString(){
        return "Pessoa: Nome:" + this.nome + "idade: " + this.idade + "sexo:" + this.sexo;
    }
}
