import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoas();

        Stream<Pessoa> stream = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));


        Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("Brasil");
        Stream<Pessoa> stream1 = pessoas.stream().filter(pred);

        Predicate<Pessoa> predi1 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        };
        Stream<Pessoa> stream2 = pessoas.stream().filter(predi1);

        Stream<Pessoa> stream3 = pessoas.stream().filter(new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        });


    }
}
