import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflections {

    public static void main(String[] args)  {
        Class clasz = Produto.class;

        System.out.println(clasz);

        Produto prod = new Produto();
        Class clasz1 = prod.getClass();
        System.out.println(clasz1);

        try {
            Constructor cons = clasz.getConstructor();
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println(cons);
            System.out.println(prod1);

            Field[] fields =  prod1.getClass().getDeclaredFields();
            for (Field field : fields){
                Class<?> type = field.getType();
                String nome = field.getName();
                System.out.println(type);
                System.out.println(nome);
            }

           Method[] method = prod1.getClass().getDeclaredMethods();
            for (Method m : method){
                Class<?> type = m.getReturnType();
                String nome = m.getName();
                System.out.println(type);
                System.out.println(nome);
                System.out.println("Executando métodos: ");
                
            }

        }catch (NoSuchMethodException e){
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
