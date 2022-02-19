public class TarefaWrapper {
    public static void main(String[] args) {
        double n1 = 5;
        double n2 = 4;
        double n3 = 8;
        double media = (n1 + n2 + n3) /3;

        System.out.println((int)media);//cast padrão

        int a=20;
        Integer i=Integer.valueOf(a);//convertendo  int para Integer explicitamente
        Integer j=a;//autoboxing

        System.out.println(a+" "+i+" "+j);

    }

}
