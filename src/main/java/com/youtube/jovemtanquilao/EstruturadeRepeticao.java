package com.youtube.jovemtanquilao;

import java.util.ArrayList;

public class EstruturadeRepeticao {
    public static void main(String[] args) {
//        listadePalavras();
//        forClassico();
//        forPuro();
        inverterString();
    }

    private static void listadePalavras() {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Academia");
        palavrasList.add("Games");
        palavrasList.add("Joao");
        palavrasList.add("Jose");
        palavrasList.add("Maria");

        for(String palavra : palavrasList){
            System.out.println(palavra);
        }
        palavrasList.forEach(palavra -> System.out.println(palavra));
    }

    private static void forClassico() {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Academia");
        palavrasList.add("Games");
        palavrasList.add("Joao");
        palavrasList.add("Jose");
        palavrasList.add("Maria");

        for(int i = 0;i<palavrasList.size(); i++){
            System.out.println(palavrasList.get(i));
        }

    }
    private static void forPuro(){
        for (int i = 0; i<=10; i++){
            System.out.println(i);
        }
    }
    private static void inverterString(){
        String normal = "1234";
        String invertida = "";

        for (int posicao = normal.length()-1; posicao >=0; posicao--){
            invertida=invertida+normal.charAt(posicao);
        }
        System.out.println(invertida);
    }
}
