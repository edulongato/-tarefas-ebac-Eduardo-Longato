public class AppCarro {

    public static void main(String[] args) {
        System.out.println(FabricaDeCarro.fabricarCarro(CategoriaDoCarro.COMPACTO));
        System.out.println(FabricaDeCarro.fabricarCarro(CategoriaDoCarro.LUXO));
        System.out.println(FabricaDeCarro.fabricarCarro(CategoriaDoCarro.SEDAN));
    }
}
