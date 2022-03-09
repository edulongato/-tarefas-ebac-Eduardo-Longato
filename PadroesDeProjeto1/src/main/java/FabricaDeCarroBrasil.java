public class FabricaDeCarroBrasil {

    public static Carro fabricarCarro(CategoriaDoCarro model){
        Carro car = null;
        switch (model){
            case COMPACTO -> car = new CarroCompacto(Localizacao.BRASIL);

            case LUXO -> car = new CarroDeLuxo(Localizacao.BRASIL);

            case SEDAN -> car = new CarroSedan(Localizacao.BRASIL);

            default -> System.out.println("Carro sem tipificação");
        }
        return car;
    }
}
