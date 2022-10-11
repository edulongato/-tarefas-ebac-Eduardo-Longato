import java.util.List;

public class Pessoa {

    private String id;
    private String nome;
    private String nacionalidade;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String id, String nome, String nacionalidade, int idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoa> popularPessoas(){
        Pessoa pessoa1 = new Pessoa("p1", "Debora Silva", "Brasil", 40);
        Pessoa pessoa2 = new Pessoa("p2", "Carlos Longato", "Italia", 40);
        Pessoa pessoa3 = new Pessoa("p3", "Marcio Santos", "Espanha", 28);
        Pessoa pessoa4 = new Pessoa("p4", "Yoko Sakamoto", "Japão", 35);
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4);
    }
}
