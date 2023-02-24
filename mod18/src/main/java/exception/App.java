package exception;

import javax.swing.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o codigo do cliente",
                "", JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consultarCliente(opcao);
        }catch (ClienteNaoEncontrado2Exception e){
            JOptionPane.showInputDialog(null,
                    e.getMessage(),
                    "Sair", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
