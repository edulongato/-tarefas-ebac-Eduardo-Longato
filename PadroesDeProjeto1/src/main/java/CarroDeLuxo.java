public class CarroDeLuxo extends Carro{

    CarroDeLuxo(Localizacao localizacao){
        super(CategoriaDoCarro.LUXO, localizacao);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Fabricando Carro de Luxo");
        System.out.println("Acessorio 1: Farol de xeon");
        System.out.println("Acessorio 2: Regulagem eletronica dos bancos");
        System.out.println("Acessorio 3: Regulagem de altura e profundidade do volante");
    }
}
