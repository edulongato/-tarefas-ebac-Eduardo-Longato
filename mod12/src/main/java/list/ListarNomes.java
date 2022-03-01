package list;

import domain.Nomes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListarNomes {

    public static void main(String[] args) {

        List<Nomes> listar = new ArrayList<Nomes>();

        Nomes a = new Nomes("Jorge Amado");
        Nomes b = new Nomes("Zelia Duncan");
        Nomes c = new Nomes("Carlos Alberto");
        Nomes d = new Nomes("Valkiria Santos");
        Nomes e = new Nomes("Cintia Almeida");
        Nomes f = new Nomes("Juliano Silva");
        Nomes g = new Nomes("Tinoco Oliveira");
        Nomes h = new Nomes("Lourdes Machado");
        Nomes i = new Nomes("Alipio Santos");

        listar.add(a);
        listar.add(b);
        listar.add(c);
        listar.add(d);
        listar.add(e);
        listar.add(f);
        listar.add(g);
        listar.add(h);
        listar.add(i);
        Collections.sort(listar);
        System.out.println("\n" +listar);

    }
}
