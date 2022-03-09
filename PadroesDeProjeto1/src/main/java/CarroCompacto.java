public class CarroCompacto extends Carro{


    CarroCompacto(Localizacao localizacao){
        super(CategoriaDoCarro.COMPACTO, localizacao);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Fabricando Carro Compacto");
        System.out.println("Acessorio 1: Preparação para som");
        System.out.println("Acessorio 2: Travas eletricas");
    }
}
