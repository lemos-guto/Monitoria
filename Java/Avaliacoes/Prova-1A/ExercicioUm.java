import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int tamanho = 0;
        int valor = 0;

        System.out.print("Digite a quantidade de números que deseja guardar: ");
        tamanho = sn.nextInt();
        int[] arrayInteiro = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o valor do %d número: ", i + 1);
            arrayInteiro[i] = sn.nextInt();
        }

        System.out.print("Digite o valor que deseja verificar: ");
        valor = sn.nextInt();

        System.out.println("Saida: " + verificarExistencia(arrayInteiro, valor));
        sn.close();
    }

    public static int verificarExistencia(int[] arrayInteiro, int valor) {
        int index = 0;
        for (int i = 0; i < arrayInteiro.length; i++) {
            if (valor == arrayInteiro[i]) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
}
