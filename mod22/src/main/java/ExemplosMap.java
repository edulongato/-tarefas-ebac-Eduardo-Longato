import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemplosMap {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoas();


        Stream<Integer> stream = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);

        IntStream stream1 = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);
    }
}
