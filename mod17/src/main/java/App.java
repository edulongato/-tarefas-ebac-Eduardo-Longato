import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> carros = new ArrayList<>();
        carros.add(String.valueOf(new Fiat<String>("Punto", "Fiat")));
        carros.add(String.valueOf(new Honda<String>("Civic", "Honda")));
        carros.add(String.valueOf(new Toyota<String>("Corolla", "Toyota")));
        carros.add(String.valueOf(new Toyota<String>("Accord", "Toyota")));

        imprimirCarros(carros);
    }

    private static void imprimirCarros(List<String> carros) {
        for(String car : carros){
            System.out.println(car);
        }
    }


}
