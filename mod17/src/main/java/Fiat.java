public class Fiat implements Carro {

    private String modelo = "PUNTO";
    private String montadora = "FIAT";

    public Fiat() {
        this.modelo = getModelo();
        this.montadora = getMontadora();
    }

    @Override
    public String nome(String nome) {

        return nome;
    }

    @Override
    public String fabrica(String montadora) {

        return montadora;
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
