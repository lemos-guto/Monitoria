import java.text.DecimalFormat;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double compra = 0.0;
        double desconto = 0.0;
        double valorFinal = 0.0;
        DecimalFormat formatar = new DecimalFormat("0.00");

        System.out.print("Digite o valor da sua compra: ");
        compra = sn.nextDouble();

        if (compra >= 10.00 && compra <= 99.99) {
            desconto = 0.05;

        } else if (compra >= 100.00 && compra <= 499.99) {
            desconto = 0.10;

        } else if (compra >= 500.00) {
            desconto = 0.15;
        }

        valorFinal = compra - (compra * desconto);

        System.out.println("O valor final da sua compra foi R$" + formatar.format(valorFinal)
                + " e o desconto dado foi de %" + (int) (desconto * 100) + ".");
        sn.close();
    }
}
