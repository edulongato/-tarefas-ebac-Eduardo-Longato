public class FabricaDeCarroPadrao {

    public static Carro fabricarCarro(CategoriaDoCarro model){
        Carro car = null;
        switch (model){
            case COMPACTO -> car = new CarroCompacto(Localizacao.PADRAO);

            case LUXO -> car = new CarroDeLuxo(Localizacao.PADRAO);

            case SEDAN -> car = new CarroSedan(Localizacao.PADRAO);

            default -> System.out.println("Localização desconhecida!");
        }
        return car;
    }
}
