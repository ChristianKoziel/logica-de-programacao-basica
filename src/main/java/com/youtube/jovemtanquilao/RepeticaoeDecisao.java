package com.youtube.jovemtanquilao;

import java.util.ArrayList;

public class RepeticaoeDecisao {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeUmaDez = new ArrayList<>();
        for(int posicao = 1; posicao <= 10; posicao++){
            listaDeUmaDez.add(posicao);
        }
        ArrayList<Integer> numPares = new ArrayList<>();
        ArrayList<Integer> numImpares = new ArrayList<>();

        for (Integer numero : listaDeUmaDez){
            if(numero % 2 ==0){
                numPares.add(numero);
            }else{
                numImpares.add(numero);
            }
        }
//        for (Integer numeroPar : numPares){
//            System.out.println(numeroPar);
//        }
//        for (Integer numeroImpar : numImpares){
//            System.out.println(numeroImpar);
//        }
        System.out.println(numPares+" sao numeros pares");
        System.out.println(numImpares+" sao numeros impares");
    }
}
