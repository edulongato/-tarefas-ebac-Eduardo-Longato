import java.util.List;
import java.util.Objects;

public class Genero {

    private String id;
    private String nome;
    private String sexo;
    private int idade;

    public Genero(){

    }

    public Genero(String id, String nome, String sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo(String feminino) {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Genero> popularGenero(){
        Genero gen1 = new Genero("g1","Carlos ", "Masculino", 41 );
        Genero gen2 = new Genero("g2","Maria ", "Feminino", 37 );
        Genero gen3 = new Genero("g3","Alberto ", "Masculino", 22 );
        Genero gen4 = new Genero("g4","Sandra ", "Feminino", 30 );
        return List.of(gen1, gen2, gen3, gen4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genero genero)) return false;
        return Objects.equals(getNome(), genero.getNome()) && Objects.equals(getSexo("Feminino"), genero.getSexo("Feminino"));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSexo("Feminino"));
    }
}
