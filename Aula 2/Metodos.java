public class Metodos {

    public static void main(String[] args) {

        double[] numeros = new double[3];
        numeros[0] = 8.5;
        numeros[1] = 15.7;
        numeros[2] = 42.2;

        int[] valores = new int[3];
        valores[0] = 13;
        valores[1] = 26;
        valores[2] = 78;

        System.out.println(somaDosValores(numeros));
        System.out.println(mediaAritimetica(numeros));
        System.out.println(maiorValor(valores));
        System.out.println(menorValor(valores));

    }

    public static double somaDosValores(double[] numeros) {
        double soma = 0.0;
        for (double numero : numeros) {
            soma = soma + numero;
        }
        return soma;
    }

    public static double mediaAritimetica(double[] numeros) {
        double media = 0.0;
        for (double numero : numeros) {
            media = media + numero;
        }
        media = media / numeros.length;
        return media;
    }

    public static int maiorValor(int[] valores) { // pode usar o metodo Math.max
        int maior = 0;
        for (int valor : valores) {
            if (valor > maior) {
                maior = valor;
            } else if (maior == 0) {
                maior = valor;
            }
        }
        return maior;
    }

    public static int menorValor(int[] valores) { // pode usar o metodo Math.min
        int menor = 0;
        for (int valor : valores) {
            if (valor < menor) {
                menor = valor;
            } else if (menor == 0) {
                menor = valor;
            }
        }
        return menor;
    }
}