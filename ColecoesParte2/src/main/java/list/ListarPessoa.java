package list;

import domain.Pessoa;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ListarPessoa {

    public static void main(String[] args) {
        listaPessoaPorSexo();
    }

    private static void listaPessoaPorSexo() {

        List<Pessoa> lista = new ArrayList<Pessoa>();

        Pessoa a = new Pessoa("Marcos Cesar", "MASCULINO");
        Pessoa b = new Pessoa("Debora Silva", "FEMININO");
        Pessoa c = new Pessoa("Jorge Manoel", "MASCULINO");
        Pessoa d = new Pessoa("Maria Silva", "FEMININO");
        Pessoa e = new Pessoa("Claudio Mattos", "MASCULINO");
        Pessoa f = new Pessoa("Rosangela Medeiros", "FEMININO");

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);

        Collections.sort(lista);
        System.out.println("Lista com ordenação: \n" + lista);


    }
}
