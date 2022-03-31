public class Honda implements Carro {

    private String modelo = "CIVIC";
    private String montadora = "HONDA";

    public Honda() {
        this.modelo = getModelo();
        this.montadora = getMontadora();
    }    

    @Override
    public String nome(String nome) {
       return nome;
    }

    @Override
    public String fabrica(String marca) {
       return marca;
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
