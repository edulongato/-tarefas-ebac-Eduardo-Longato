import java.util.List;

public class TarefaMod22 {
    public static void main(String[] args) {
        List<Genero> lista = new Genero().popularGenero();

        lista.forEach(genero -> System.out.println(genero.getNome() + genero.getSexo("Feminino")));

        System.out.println("\n*********");
        System.out.println("*********\n");

         lista.stream()
                .filter(genero -> genero.getSexo("Feminino").equals("Feminino"))
                 .forEach(genero -> System.out.println(genero.getNome() + genero.getSexo("Feminino")));

    }


    public List<Genero> filtrarGeneroFeminino(List<Genero> lista) {
        //System.out.println(lista);
        return lista;
    }
}
