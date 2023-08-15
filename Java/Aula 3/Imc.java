import java.text.DecimalFormat;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        /* entrada: peso, altura
         * imc = peso / (altura * altura)
         */
        Scanner sn = new Scanner(System.in);
        double peso = 0.0;
        double altura = 0.0;
        DecimalFormat formatar = new DecimalFormat("0.00");

        System.out.println("Digite seu peso em kg: ");
        peso = sn.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        altura = sn.nextDouble();

        System.out.println(verificarImc(peso, altura));
        System.out.println(calcularDifereça(peso, altura, formatar));

        sn.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String verificarImc (double peso, double altura){
        double imc = calcularIMC(peso, altura);
        String aviso = "";
        if (imc < 18.5){
            aviso = "baixo peso";
        }
        else if (imc >= 18.5 && imc <= 24.9){
            aviso = "o peso normal";
        }
        else if (imc >=25.0 && imc <= 29.9){
            aviso = "excesso de peso";
        }
        else if (imc >=30.0 && imc <= 24.9){
            aviso = "obesidade de classe 1";
        }
        else if (imc >=35.0 && imc <= 39.9){
            aviso = "obesidade de classe 2";
        }
        else if (imc >= 40.00){
            aviso = "obesidade de classe 1";
        }
        aviso = "De acordo com as diretrizes de Índice de Massa Corporal, você está com " + aviso + ".";
        return aviso;
    }

    public static String calcularDifereça (double peso, double altura, DecimalFormat formatar){
        double imc = calcularIMC(peso, altura);;
        double diferenca = 0.0;
        String aviso = "";
        final double PESONOMRAL = 24.9;

        if (imc < PESONOMRAL){
            diferenca = (PESONOMRAL - imc) * (altura * altura);   
            aviso = "Para se adequar ao peso 'normal', você deve ganhar " + formatar.format(diferenca) + "Kg.";
        }
        else if (imc > PESONOMRAL){
            diferenca = (imc - PESONOMRAL) * (altura * altura);
            aviso = "Para se adequar ao peso 'normal', você deve perder " + formatar.format(diferenca) + "Kg.";
        }
        else {
            aviso = "Seu peso é o ideal!";
        }
        return aviso;
    }
 }