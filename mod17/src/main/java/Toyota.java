public class Toyota implements Carro {

    private String modelo = "COROLLA";
    private String montadora = "TOYOTA";

    public Toyota() {
        this.modelo = getModelo();
        this.montadora = getMontadora();
    }

    @Override
    public String nome(String nome) {
        return null;
    }

    @Override
    public String fabrica(String marca) {
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                "modelo='" + modelo + '\'' +
                ", fabrica='" + montadora + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public String getMontadora() {
        return montadora;
    }



}
