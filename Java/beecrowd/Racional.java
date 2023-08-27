import java.util.Scanner;

public class Racional {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int vezes = sn.nextInt();
        sn.nextLine();
        String[] operacoes = new String[vezes];
        String resultado = "";

        if (vezes >= 1 && vezes <= 1 * Math.pow(10, 4)) {
            for (int i = 0; i < vezes; i++) {
                String linha = sn.nextLine(); // 1 / 2 + 3 / 4
                char[] operacao = new char[linha.length()];
                operacao = linha.toCharArray();
                int N1 = Character.getNumericValue(operacao[0]);
                int D1 = Character.getNumericValue(operacao[4]);
                int N2 = Character.getNumericValue(operacao[8]);
                int D2 = Character.getNumericValue(operacao[12]);
                int x = 0;
                int y = 0;

                if ((N1 / D1) >= 0 && (N1 / D1) <= 1000 && (N2 / D2) >= 0 && (N1 / D2) <= 1000) {
                    switch (operacao[6]) {
                        case '+':
                            x = (N1 * D2) + (N2 * D1);
                            y = D1 * D2;
                            break;
                        case '-':
                            x = (N1 * D2) - (N2 * D1);
                            y = D1 * D2;
                            break;
                        case '*':
                            x = N1 * N2;
                            y = D1 * D2;
                            break;
                        case '/':
                            x = N1 * D2;
                            y = N2 * D1;
                            break;
                        default:
                            resultado = ("Operação inválida");
                    }
                    resultado = (x + "/" + y + " = " + simplificar(x, y));
                } else {
                    resultado = "Os valores passaram de 1000 ou são menores que 0.";
                }
                operacoes[i] = resultado;
            }
        } else {
            resultado = "Quantidade de casos de teste inválida";
        }
        for (String valor : operacoes) {
            System.out.println(valor);
        }
        sn.close();
    }

    public static String simplificar(int x, int y) {
        int resto;
        int a = x;
        int b = y;
        while (y != 0) {
            resto = x % y;
            x = y;
            y = resto;
        }
        if (x != 0) {
            a = a / x;
            b = b / x;
            if (b < 0) {
                a = a * -1;
                b = b * -1;
            }
        } else {
            System.out.println("não da para divisir por 0");
        }
        return a + "/" + b;
    }
}