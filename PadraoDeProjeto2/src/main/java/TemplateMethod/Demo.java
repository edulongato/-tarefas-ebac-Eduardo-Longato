package TemplateMethod;

public class Demo {

    public static void main(String[] args) {
        Trabalhador trabalhador = new Bombeiro();
        trabalhador.executar();

        Trabalhador t = new Carteiro();
        t.executar();

        Trabalhador ad = new Advogado();
        ad.executar();

    }
}
