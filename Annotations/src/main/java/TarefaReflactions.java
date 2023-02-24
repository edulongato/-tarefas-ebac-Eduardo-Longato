import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class TarefaReflactions {

    public static void main(String[] args) throws NoSuchFieldException {

        Class<Tabela> t = Tabela.class;

        Class<?>[] interfaces = t.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());        }

        System.out.println("\n**************\n");

        Annotation[] atributo = t.getAnnotations();
        for (Annotation anAtributo : atributo) {
            System.out.println(anAtributo);
        }

        System.out.println("\n**************\n");

        /*Field tabelaField = t.getDeclaredField("Tabela");
        Tabela tabelaAnnotation = tabelaField.getAnnotation(Tabela.class);
        String nomeTabela = tabelaAnnotation.tabela();
        System.out.println("Nome da Tabela: " + nomeTabela);*/

    }
}
