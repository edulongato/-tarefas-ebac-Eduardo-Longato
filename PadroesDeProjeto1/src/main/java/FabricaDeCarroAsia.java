public class FabricaDeCarroAsia {

    public static Carro fabricarCarro(CategoriaDoCarro model){
        Carro car = null;
        switch (model){
            case LUXO -> car = new CarroDeLuxo(Localizacao.ASIA);

            case COMPACTO -> car = new CarroCompacto(Localizacao.ASIA);

            case SEDAN -> car = new CarroSedan(Localizacao.ASIA);

            default -> System.out.println("Localizacao desconhecida!");
        }
        return car;
    }
}
