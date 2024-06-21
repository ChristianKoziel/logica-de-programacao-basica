package com.youtube.jovemtanquilao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturadeDecisao {
    public static void main(String[] args) throws ParseException{
         numPar();
         stringIgual();
         stringInicia();
         datas();
    }

    private static void numPar() {
        Integer num = 2;
        if(num %  2 == 0){
            //executo aqui se verdadeiro
            System.out.println(num + " é par");
        }else{
            //executo aqui se falso
            System.out.println(num + " é impar");
        }
    }
    private static void stringIgual() {
        String frase = "Hoje é segunda nove da manha";
        if(frase.contains("quinta")){
            //executo aqui se verdadeiro
            System.out.println( " quase sexta");
        }else if (frase.contains("sexta")||frase.contains("sabado")||frase.contains("domingo")){
            //executo aqui se falso
            System.out.println(" dia de alegria");
        }else if (frase.contains("segunda"))
            if (frase.contains("seis da tarde")){
                System.out.println("hora de alegria");
            }
        else{
            System.out.println("dia normal");
        }
    }
    private static void stringInicia() {
        String palavra = "bobeira";
        if(palavra.startsWith("a")){
            System.out.println("a palavra inicia em a");
        }else{
            System.out.println("a palavra inicia com outra letra");
        }
    }

    private static void datas() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("22/06/2040");

        if (!data.before(new Date())){
            System.out.println(data+" esse dia esta por vir");
        }else{
            System.out.println(data+" esse dia ja passou");
            System.out.println("teste");
        }
    }
}
