import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Stream<String> stream = List.of("Edu", "Long", "Teste").stream();

        Set.of("Edu", "Long", "Teste").stream();

        Map<String, String> map = Map.of("Carlos", "Campa");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "ads");
    }
}
