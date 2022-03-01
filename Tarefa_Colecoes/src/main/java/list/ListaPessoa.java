package list;

import domain.People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPessoa {

    public static void main(String[] args) {

        listarGenero();
    }

    private static void listarGenero() {

        List<People> lista = new ArrayList<People>();

        People a = new People("Marcos Cesar", "MASCULINO");
        People b = new People("Debora Silva", "FEMININO");
        People c = new People("Jorge Manoel", "MASCULINO");
        People d = new People("Maria Silva", "FEMININO");
        People e = new People("Claudio Mattos", "MASCULINO");
        People f = new People("Rosangela Medeiros", "FEMININO");

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
