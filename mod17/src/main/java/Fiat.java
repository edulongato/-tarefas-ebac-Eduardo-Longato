public class Fiat implements Carro {

    private String modelo = "PUNTO";
    private String montadora = "FIAT";

    public Fiat() {
        this.modelo = getModelo();
        this.montadora = getMontadora();
    }

    @Override
    public void nome(String nome) {

    }

    @Override
    public void montadora(String montadora) {

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
