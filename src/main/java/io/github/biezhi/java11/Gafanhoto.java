package io.github.biezhi.java11;

public class Gafanhoto extends Pessoa{
    private String login;
    private boolean toAssistindo;

    public Gafanhoto(String nome, int idade, char sexo, String login, boolean toAssistindo){
        super(nome,idade,sexo);
        this.login= login;
        this.toAssistindo= toAssistindo;
            }

    public String getLogin(){
        return this.login;
    }
    public void setLogin(String l){
        this.login=l;
    }

    public boolean gettoAssistindo(){
        return this.toAssistindo;
    }

    public void settoAssistindo(boolean t){
        this.toAssistindo =t;
    }


    public void viuMaisUm(){
        
        }

    @Override
    public String toString() {
        return "Gafanhoto [" + super.toString() + "login= + " + login + ", + toAssistindo= +" + toAssistindo + "]";
    }

}