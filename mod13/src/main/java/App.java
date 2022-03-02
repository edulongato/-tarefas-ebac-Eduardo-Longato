public class App {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Carlos");
        pf.setSobrenome("Almeida");
        pf.setCpf(111111111L);

        PessoaJuridica pj  = new PessoaJuridica();
        pj.setNomeFantasia("Coca-Cola");
        pj.setCnpj(2222222222222222L);

        pf.imprimirNomeSobrenome();
        System.out.println("CPF: " + pf.getCpf());

        System.out.println("\n");

        pj.imprimirNomeFantasia();
        System.out.println("CNPJ: " + pj.getCnpj());
    }
}
