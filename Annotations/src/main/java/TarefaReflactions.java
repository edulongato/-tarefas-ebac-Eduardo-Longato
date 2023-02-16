import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class TarefaReflactions {

    public static void main(String[] args) {

        Class<Tabela> t = Tabela.class;
        Class<?>[] interfaces = t.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Class<Tabela> c = Tabela.class;
        Annotation[] atributo = c.getAnnotations();
        for (Annotation anAtributo : atributo) {
            System.out.println(anAtributo);
        }
    }
}
