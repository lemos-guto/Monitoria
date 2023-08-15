import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int quantidaDeNotas = 3;
        int i = 1;
        double media = 0.0;
        double[] notas = new double[quantidaDeNotas];
        DecimalFormat formatar = new DecimalFormat("0.00");

        System.out.println("Se a nota for quebrada, use vírgula para separar!");

        for (double nota : notas) {
            System.out.printf("Digite a nota número %d: ", i++);
            nota = sn.nextDouble();
            media = media + nota;
        }

        System.out.printf("A sua media é: " + formatar.format(media / notas.length));
        sn.close();
    }
}
