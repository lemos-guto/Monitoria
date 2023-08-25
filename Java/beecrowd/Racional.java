import java.util.Scanner;

public class Racional {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int vezes = sn.nextInt();
        String[] operacoes = new String[vezes];
        String resultado = "";
        String vazio = sn.nextLine();

        if (vezes >= 1 || vezes <= 1 * Math.pow(10, 4) ){
            for(int i=0; i<vezes; i++){
                String linha = sn.nextLine(); //1 / 2 + 3 / 4
                char[] operacao = new char[linha.length()];
                operacao = linha.toCharArray();
                int N1 = Character.getNumericValue(operacao[0]);
                int D1 = Character.getNumericValue(operacao[4]);
                int N2 = Character.getNumericValue(operacao[8]);
                int D2 = Character.getNumericValue(operacao[12]);
                int x = 0;
                int y = 0;

                switch (operacao[6]){
                    case '+':
                    x = (N1*D2) + (N2*D1);
                    y = D1*D2;
                    case '-':
                    x = (N1*D2) - (N2*D1);
                    y = D1*D2;
                    case '*':
                    x = N1*N2;
                    y = D1*D2;
                    case '/':
                    x = N1*D2;
                    y = N2*D1;
                    default:
                    resultado = ("Operação inválida");
                }
            if (x >= 1 || x <= 1000 || y >= 1 || y <= 1000){
                resultado = (x + "/" + y + " = " + simplificar(x, y));
                }
            else{
                resultado = "Os valores passaram de 1000 ou são menores que 0.";
                }

                operacoes[i] = resultado;
            }
        }
        else {
            resultado = "Quantidade de casos de teste inválida";
        }
        for(String valor : operacoes){
            System.out.println(valor);
        }
}

    public static String simplificar(int x, int y){
        int resto;
        int a = x;
        int b = y;
        while (y != 0) {
            resto = x % y;
            x = y;
            y = resto;
        }
         a = a/x;
         b = b/x;
        return a + "/" + b;
    }
}