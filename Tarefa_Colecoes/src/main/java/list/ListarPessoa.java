package list;

import domain.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListarPessoa {

    public static void main(String[] args) {

        listarPessoa();
    }

    private static void listarPessoa() {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<Pessoa>();
        String resp;

        do {
            System.out.println("Digite um nome: ");
            lista.add(new Pessoa(sc.nextLine()));
            System.out.println("Deseja digitar outro nome: Y/N");
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("Y"));

        Collections.sort(lista);
        for (Pessoa pessoa: lista) {
            System.out.println(pessoa.getNome());
        }

    }
}
