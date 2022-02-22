package domain;


import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    String nome;
    String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return  "" +
                " nome= '" + nome + '\'' +
                ", sexo= '" + sexo + '\'' +
                '\n';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        //return this.nome.compareTo(pessoa.getNome());
        return this.sexo.compareTo(pessoa.getSexo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(getNome(), pessoa.getNome()) && Objects.equals(getSexo(), pessoa.getSexo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSexo());
    }
}
