import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da primeira nota: ");
        double nota1 = sc.nextInt();

        System.out.println("Insira o valor da segunda nota: ");
        double nota2 = sc.nextInt();

        System.out.println("Insira o valor da terceira nota: ");
        double nota3 = sc.nextInt();

        System.out.println("Insira o valor da quarta nota: ");
        double nota4 = sc.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média é: " + media);
        sc.close();

    }
}
