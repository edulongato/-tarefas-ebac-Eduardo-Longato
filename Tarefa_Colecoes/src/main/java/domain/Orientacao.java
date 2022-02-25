package domain;

import java.util.Objects;

public class Orientacao implements Comparable<Orientacao>{

    String sexo;

    public Orientacao(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Orientacao{" +
                "sexo = '" + sexo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orientacao)) return false;
        Orientacao that = (Orientacao) o;
        return Objects.equals(getSexo(), that.getSexo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSexo());
    }

    @Override
    public int compareTo(Orientacao orientacao) {
        return this.sexo.compareTo(orientacao.getSexo());
    }
}
