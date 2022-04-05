public class Fiat<T> implements Carro {

    private T modelo;
    private T montadora;

    public Fiat(String modelo, String montadora) {
        this.modelo = (T) nome(modelo);
        this.montadora = (T) fabrica(montadora);
    }

    @Override
    public String toString() {
        return "{" +
                "modelo='" + modelo + '\'' +
                ", fabrica='" + montadora + '\'' +
                '}';
    }

    public T getModelo() {
        return modelo;
    }

    public T getMontadora() {
        return montadora;
    }


    @Override
    public Object nome(Object nome) {
        return nome;
    }

    @Override
    public Object fabrica(Object marca) {
        return marca;
    }
}
