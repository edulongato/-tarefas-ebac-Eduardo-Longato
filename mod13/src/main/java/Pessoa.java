public abstract class Pessoa {

    private String nome;
    private String sobrenome;

    private String nomeFantasia;

    public void imprimirNomeSobrenome(){
        System.out.println("Seu nome é: " + this.nome + this.sobrenome);
    }

    public void imprimirNomeFantasia(){
        System.out.println("Nome fantasia é: " + this.nomeFantasia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }


}
