import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TesteMod22 {
    @Test
    public void pessoaTest(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos");

        Assertions.assertEquals("Carlos", pessoa.getNome());
    }
    @Test
    public void generoTeste(){
        Genero gen = new Genero();
        gen.setSexo("feminino");
        Assert.assertEquals("feminino", gen.getSexo("Feminino"));
    }


}
