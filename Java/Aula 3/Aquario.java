import java.util.Scanner;

public class Aquario {
    static Scanner sn = new Scanner (System.in);
    private static double comprimento = 0.0;
    private static double altura = 0.0;
    private static double largura = 0.0;
    static double temperaturaDesejada = 0.0;
    static double temperaturaAmbiente = 0.0;
    public static void main(String[] args) {
         
         System.out.println("Digite o comprimento do seu aquário: ");
         comprimento = sn.nextDouble();
         System.out.println("Digite a altura do seu aquário: ");
         altura = sn.nextDouble();
         System.out.println("Digite a largura do seu aquário: ");
         largura = sn.nextDouble();
         System.out.println("Digite a temperatura desejada para o seu aquário: ");
         temperaturaDesejada = sn.nextDouble();
         System.out.println("Digite a temperatura ambientoe: ");
         temperaturaAmbiente = sn.nextDouble();
         double volume = calcularVolume(comprimento, altura, largura);

         System.out.printf("O volume do seu aquário é de %d litros.\n", Math.round(volume));
         System.out.printf("A quantidade de filtragem por hora é de %d litros ou de %d litros.\n", Math.round(calcularFiltragem(volume)[0]), Math.round(calcularFiltragem(volume)[1]) );
         System.out.printf("A potencia do seu aquário deve ser de %d.", Math.round(calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente)));
         sn.close();

    }

    public Aquario(double comprimento, double altura, double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Aquario(double lado){
        comprimento = lado;
        altura = lado;
        largura = lado;
    }

    public static double calcularPotencia (double volume, double temperaturaDesejada, double temperaturaAmbiente){
        double potencia = volume * 0.5 * (temperaturaDesejada - temperaturaAmbiente);
        return  potencia;
    }

    public static double[] calcularFiltragem (double volume){
        double[] filtragem = {volume * 2, volume * 3};
        return filtragem;
    }

    public static double calcularVolume (double comprimento, double altura, double largura){
        double volume = (comprimento * altura * largura) / 1000;
        return volume;
    }
}
        /* entrada: comprimeto, altura e largura
         * calcular: volume em litros, potencia do termostato, filtragem por hora
         * volume = comprimento * altura * largura
         * potencia = volume * 0,5 (temperatura desejada - temperatura ambiente)
         * filtragem = 2 a 3 vezes o volume do aquario
         */
