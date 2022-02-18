/*
    Tarefa modulo 7 EBAC Java BackEnd.

 */

public class Cliente {

    private String nome;
    private String endereco;
    private String email;
    private int fone;
    private int CPF;

    public Cliente(String nome, String endereco, String email, int fone, int CPF) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.fone = fone;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
}
