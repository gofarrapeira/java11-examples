package io.github.biezhi.java11;


    public class ProjetoVideo{

        public static void main(String[] args){
            Video video[] = new Video[3];
            video[0] = new Video("Orgulho e Preconceito");
            video[0].setAvaliacao("10");
            video[0].setCurtidas(220000);
            video[0].setViews(240000);
            video[0].play();
            System.out.println(video[0].toString());
//adicionando comentario so pra commitar
            Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Joao", 12, 'M',"Joaozinho", false);
            System.out.println(gafanhoto[0].toString());
    }}

