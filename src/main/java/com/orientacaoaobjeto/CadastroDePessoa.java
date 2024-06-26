package com.orientacaoaobjeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CadastroDePessoa {
    public static void main (String[] Args)throws ParseException {
        Pessoa zumba = new Pessoa();
        zumba.setNome("Zumba Games");
        zumba.setSexo("masculino");
        zumba.mudarNome("Joaozinho");
        zumba.setDataDeNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2021"));
        System.out.println(zumba.getDataDeNascimento());
    }
}
