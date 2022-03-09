public abstract class FabricaDeCarro {

    private FabricaDeCarro(){

    }

    public static Carro fabricarCarro(CategoriaDoCarro type){
        Carro carro;
        Localizacao localizacao = Localizacao.BRASIL;

        switch (localizacao){
            case BRASIL -> carro = FabricaDeCarroBrasil.fabricarCarro(type);

            case ASIA -> carro = FabricaDeCarroAsia.fabricarCarro(type);

            default -> carro = FabricaDeCarroPadrao.fabricarCarro(type);
        }
        return carro;
    }

}
