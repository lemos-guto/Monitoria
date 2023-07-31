import java.util.Scanner;

public class Aquario {
    public static void main(String[] args) {
         Scanner sn = new Scanner (System.in);
         double comprimento = 0.0;
         double altura = 0.0;
         double largura = 0.0;

         System.out.println("Digite o comprimento do seu aquário: ");
         comprimento = sn.nextDouble();
         System.out.println("Digite a altura do seu aquário: ");
         altura = sn.nextDouble();
         System.out.println("Digite a largura do seu aquário: ");
         largura = sn.nextDouble();
         double volume = calcularVolume(comprimento, altura, largura);

         System.out.printf("O volume do seu aquário é de %f litros.", volume);
         System.out.printf("A quantidade de filtragem por hora é de %f litros.", calcularFiltragem(volume));
         sn.close();

    }

    public static double calcularPotencia (double volume, double temperaturaDesejada, double temperaturaAmbiente){
        
        return  0.0;
    }

    public static double calcularFiltragem (double volume){
        double filtragem = volume * 2.5;
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
