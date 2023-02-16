import java.lang.reflect.Field;

public class TarefaReflactions {

    public static void main(String[] args) {

        Class<Tabela> t = Tabela.class;
        Class<?>[] interfaces = t.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Class<Tabela> classe = Tabela.class;
        for (Field atributo : classe.getDeclaredFields()) {
            System.out.println(atributo.getName());
        }
    }
}
