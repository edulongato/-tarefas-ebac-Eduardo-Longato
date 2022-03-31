public class Honda implements Carro {

    private String modelo = "CIVIC";
    private String montadora = "HONDA";

    public Honda() {
        this.modelo = getModelo();
        this.montadora = getMontadora();
    }    

    @Override
    public void nome(String nome) {
        System.out.println("CIVIC" + modelo);
    }

    @Override
    public void montadora(String marca) {
        System.out.println("TOYOTA" + montadora);
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
