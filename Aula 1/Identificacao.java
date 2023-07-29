import java.util.Scanner;

public class Identificacao {
    public static void main(String[] args) {
        String codigo = "";
        boolean validacao = true;
        Scanner sn = new Scanner(System.in);

        System.out.print("Digite o seu código de indentificação por favor: ");
        codigo = sn.nextLine();

        if (codigo.length() != 7) {
            validacao = false;
        } else if (!codigo.startsWith("BR")) {
            validacao = false;
        } else if (!codigo.endsWith("X")) {
            validacao = false;
        } else {
            int numeroCodigo = Integer.parseInt(codigo.substring(2, 5));
            if (!(numeroCodigo >= 1 && numeroCodigo <= 9999)) {
                validacao = false;
            }
        }

        if (validacao == true) {
            System.out.println("Código de indentificação válido!");
        } else {
            System.out.println("Código de indentificação inválido!");
        }

        sn.close();
    }
}
