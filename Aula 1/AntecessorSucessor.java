import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int numero = 0;
        int sucessor = 0;
        int anterior = 0;

        System.out.println("Digite um número inteiro!");
        numero = sn.nextInt();

        sucessor = numero + 1;
        anterior = numero - 1;

        System.out.println("O antecessor do seu número é " + anterior + " e o sucessor é " + sucessor);
        sn.close();
    }
}