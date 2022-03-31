import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();
        carros.add(new Fiat());
        carros.add(new Honda());
        carros.add(new Toyota());
        
        imprimirCarro(carros);
    }

    private static void imprimirCarro(List<? extends Carro> carros) {
        for (Carro car : carros) {
            System.out.println(car);
        }
    }
}
