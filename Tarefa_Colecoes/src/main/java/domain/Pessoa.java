package domain;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{


        String nome;

        public Pessoa(String nome) {
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
            return "Pessoa{" +
                "nome = '" + nome + '\'' +
                '}';
        }

        @Override
        public int compareTo(Pessoa pessoa) {
            return this.nome.compareTo(pessoa.getNome());

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pessoa)) return false;
            Pessoa pessoa = (Pessoa) o;
            return Objects.equals(getNome(), pessoa.getNome());
        }

        @Override
            public int hashCode() {
            return Objects.hash(getNome());
        }
}
