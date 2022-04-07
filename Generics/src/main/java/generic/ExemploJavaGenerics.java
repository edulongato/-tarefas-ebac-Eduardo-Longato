package generic;

import fruta.Banana;
import fruta.Fruta;
import fruta.Maca;

import java.util.ArrayList;
import java.util.List;

public class ExemploJavaGenerics {

    public static void main(String[] args) {

        List<String> lista = new ArrayList();
        lista.add("Carlos");
        lista.add("1");
        imprimir(lista);

        List<Long> listaLong = new ArrayList<>();
        listaLong.add(1L);
        listaLong.add(2L);
        imprimir(listaLong);

        imprimir2(listaLong);
        imprimir2(lista);

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());
        imprimirFruta(frutas);
    }

    public static <T> void imprimir(List<T> lista) {
        for (T st : lista) {
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiroLista(List<T> lista) {
        return lista.get(0);
        }

    public static void imprimir2(List<?> lista){
        for (Object obj : lista){
            System.out.println("Qualquer coisa: " + obj);
        }
    }

    public static void imprimirFruta(List<? extends Fruta> lista){
        for (Fruta fruta : lista){
            System.out.println(fruta);
        }
    }

}
