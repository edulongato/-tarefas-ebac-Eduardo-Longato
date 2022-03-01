package domain;

import java.util.Objects;

public class Nomes implements Comparable<Nomes> {

    String nome;

    public Nomes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nomes)) return false;
        Nomes nomes = (Nomes) o;
        return Objects.equals(getNome(), nomes.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }


    @Override
    public int compareTo(Nomes nomes) {
        return this.nome.compareTo(nomes.getNome());
    }
}
