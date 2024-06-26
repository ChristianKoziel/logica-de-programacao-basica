package com.orientacaoaobjeto;

import java.text.ParseException;
import java.util.ArrayList;

public class CadastroDePessoa {
    Maternidade maternidade = new Maternidade();
    ArrayList<Pessoa> pessoaList = new ArrayList<>();
    public static void main (String[] Args) throws ParseException {
        new CadastroDePessoa().rodar();
    }

    private void rodar() throws ParseException {
        Pessoa zumba = maternidade.nascer("Zumba Games", "Masculino");
        Pessoa zefrina = maternidade.nascer("Zefrina Silma", "Feminino");
        Pessoa joao = maternidade.nascer("Joao Silva", "Masculino");
        Pessoa robo = maternidade.nascer("Robo Android", "Robo");

        pessoaList.add(zumba);
        pessoaList.add(zefrina);
        pessoaList.add(joao);
        pessoaList.add(robo);

        ArrayList<Pessoa> homemList = new ArrayList<>();
        ArrayList<Pessoa> mulherList = new ArrayList<>();
        ArrayList<Pessoa> outrosGenerosList = new ArrayList<>();
        for (Pessoa pessoa : pessoaList){
             if (pessoa.getSexo().equals("Masculino")){
                 homemList.add(pessoa);
             }else if(pessoa.getSexo().equals("Feminino")){
                 mulherList.add(pessoa);
             }else{
                 outrosGenerosList.add(pessoa);
             }
        }
    }
}


