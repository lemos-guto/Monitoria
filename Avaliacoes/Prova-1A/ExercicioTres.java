import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String nome = "";
        double[] notas = new double[3];

        System.out.print("Digite o nome da(o) aluna(o): ");
        nome = sn.nextLine();

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %d° nota da(o) %s: ", i + 1, nome);
            notas[i] = sn.nextDouble();
            if (notas[i] > 10 && notas[i] < 0) {
                System.out.print("Digite uma nota de 0.0 a 10.0.");
                i--;
            }
        }

        System.out.printf("%s obteve as notas %.2f, %.2f e %.2f.\n", nome, notas[0], notas[1], notas[2]);
        System.out.printf("A nota media é %.2f.(%s)", calcularMedia(notas), verificarMedia(notas));

        sn.close();
    }

    public static double calcularMedia(double[] notas) {
        double media = 0.0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
        }
        return media / notas.length;
    }

    public static String verificarMedia(double[] notas) {
        String situacao = "";
        double media = calcularMedia(notas);
        final double azul = 6.0;

        if (media >= azul) {
            situacao = "Aprovado";
        } else {
            situacao = "Recuperação";
        }
        return situacao;
    }
}
