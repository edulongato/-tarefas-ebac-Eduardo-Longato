public class Toyota implements Carro {

    private String modelo = "COROLLA";
    private String montadora = "TOYOTA";

    public Toyota() {
        this.modelo = getModelo();
        this.montadora = getMontadora();
    }

    @Override
    public void nome(String nome) {

    }

    @Override
    public void montadora(String marca) {

    }

    @Override
    public String toString() {
        return "{" +
                "modelo='" + modelo + '\'' +
                ", montadora='" + montadora + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public String getMontadora() {
        return montadora;
    }


}
