import java.util.Scanner;

public class Metodos2 {
    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        double[] arrayDouble = arrayFicar();
        double[] arrayDouble2 = arrayFicar();
        double[] arrayDoubleFinal = juntarArray(arrayDouble, arrayDouble2);

        System.out.println("A soma dos numeros dentro do primeiro array é: " + somaArray(arrayDouble));
        System.out.println("A soma dos numeros dentro do segundo array é: " + somaArray(arrayDouble2));
        System.out.println("A media aritimetica dos numeros dentro do primeiro array é: " + calcularMedia(arrayDouble));
        System.out.println("A media aritimetica dos numeros dentro do segundo array é: " + calcularMedia(arrayDouble2));
        System.out.println("O maior numero dentro do primeiro array é: " + acharMaiorNumero(arrayDouble));
        System.out.println("O maior numero dentro do segundo array é: " + acharMaiorNumero(arrayDouble2));
        System.out.println("O menor numero dentro do primeiro array é: " + acharMenorNumero(arrayDouble));
        System.out.println("O menor numero dentro do segundo array é: " + acharMenorNumero(arrayDouble2));
        System.out.println("Os numeros dos dois arrays juntos é: ");

        for (int i = 0; i < arrayDoubleFinal.length; i++) {
            System.out.print(arrayDoubleFinal[i]);
            if (i != arrayDoubleFinal.length - 1) {
                System.out.print(" - ");
            }
        }
        sn.close();
    }

    public static double[] arrayFicar() {
        System.out.print("Quantos números você deseja utilizar? ");
        int tamanhoArray = sn.nextInt();
        double[] arrayDouble = new double[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Digite o %d numero: ", i + 1);
            arrayDouble[i] = sn.nextInt();
        }
        return arrayDouble;
    }

    public static double somaArray(double[] arrayDeDouble) {
        double soma = 0.0;
        for (double numero : arrayDeDouble) {
            soma = soma + numero;
        }
        return soma;
    }

    public static double calcularMedia(double[] arrayDouble) {
        double media = 0.0;
        int i = 0;
        for (double numero : arrayDouble) {
            media = media + numero;
            i++;
        }
        media = media / i;
        return media;
    }

    public static double acharMaiorNumero(double[] arrayDouble) {
        double maior = 0.0;

        for (double numero : arrayDouble) {
            if (maior == 0) {
                maior = numero;
            } else {
                maior = Math.max(maior, numero);
            }
        }
        return maior;
    }

    public static double acharMenorNumero(double[] arrayDouble) {
        double menor = 0.0;

        for (double numero : arrayDouble) {
            if (menor == 0) {
                menor = numero;
            } else {
                menor = Math.min(menor, numero);
            }
        }
        return menor;
    }

    public static double[] juntarArray(double[] arrayDouble, double[] arrayDouble2) {
        double[] arrayFinal = new double[arrayDouble.length + arrayDouble2.length];
        int i = 0;
        for (double numero : arrayDouble) {
            arrayFinal[i] = numero;
            i++;
        }
        for (double numero : arrayDouble2) {
            arrayFinal[i] = numero;
            i++;
        }
        return arrayFinal;
    }
}
