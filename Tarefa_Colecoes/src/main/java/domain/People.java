package domain;

import java.util.Objects;

public class People implements Comparable<People> {

    String nome;
    String sexo;

    public People(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public void People() {
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
        return "People{" + "nome='" + nome + '\'' + ", sexo='" + sexo + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        People people = (People) o;
        return Objects.equals(getNome(), people.getNome()) && Objects.equals(getSexo(), people.getSexo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSexo());
    }

    @Override
    public int compareTo(People people) {
        return people.getSexo().compareTo(this.sexo);
    }




}
