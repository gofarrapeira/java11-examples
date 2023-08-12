package io.github.biezhi.java11;

public class Video implements AcoesVideo{
    private String titulo;
    private String avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String t){
        this.titulo=t;
        this.avaliacao="Boa";
        this.views=0;
        this.curtidas=0;
        this.reproduzindo=false;
    }
    
    public String getTitulo(){
        return  this.titulo;
    }
    public void setTitulo(String t){
        this.titulo=  t;
    }
    public String avaliacao(){
        return this.avaliacao;
    }
    public void setAvaliacao(String a){
        this.avaliacao=a;
    }
    public int getViews(){
        return this.views;
    }
    public void setViews(int v){
        this.views = v;
    }
    public int getCurtidas(){
        return this.curtidas;
    }
    public void setCurtidas(int c){
        this.curtidas=c;
    }
    public boolean getReproduzindo(){
        return this.reproduzindo;
    }
    public void setReproduzindo(boolean r){
        this.reproduzindo=r;
    }

    @Override
    public void like() {
        
    }

    @Override
    public void pause() {
        
    }

    @Override
    public void play() {
        
    }

    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + "]";
    }
  
  
    }

    
    
      
