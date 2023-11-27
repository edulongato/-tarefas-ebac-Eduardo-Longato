import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TarefaMod22Test {
    @BeforeEach
    void setUp() {
        tarefaMod22 = new TarefaMod22();
    }
    private TarefaMod22 tarefaMod22;

    @Test
    void testFiltroGenero(){
        List<Genero> lista = new Genero().popularGenero();
        List<Genero> resultado = tarefaMod22.filtrarGeneroFeminino(lista);
        Assertions.assertTrue(resultado.stream().allMatch(genero -> genero.getSexo("Feminino").equals("Feminino")));
    }
}
