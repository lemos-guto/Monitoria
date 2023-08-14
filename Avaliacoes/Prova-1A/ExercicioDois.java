import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double valor = 0.0;
        int tamanho = 0;

        System.out.print("Digite a quantidade de números que deseja guardar: ");
        tamanho = sn.nextInt();
        double[] arrayDouble = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o valor do %d número: ", i + 1);
            arrayDouble[i] = sn.nextDouble();
        }

        System.out.print("Digite o valor que deseja verificar: ");
        valor = sn.nextDouble();

        System.out.println("Saida: " + calcularMedia(arrayDouble, valor));
        sn.close();
    }

    public static double calcularMedia(double[] arrayDouble, double valor) {
        double media = 0.0;
        int i = 0;
        for (double numero : arrayDouble) {
            if (numero > valor) {
                media = media + numero;
                i++;
            }
            if (i == 0) {
                i = 1;
            }
        }
        return media / i;
    }
}
