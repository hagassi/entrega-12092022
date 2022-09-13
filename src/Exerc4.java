import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num025 = 0;
        float num2650 = 0;
        float num5175 = 0;
        float num76100 = 0;
        float cont = 0;
        float valor = 0;

        for (int i = 0; i < Float.MAX_VALUE; i++) {
            if (valor > 0 && valor < 26){
                num025 = cont - num2650 - num5175 - num76100;}
            if (valor > 25 && valor < 51){
                num2650 = cont - num025 - num5175 - num76100;}
            if (valor > 50 && valor < 76){
                num5175 = cont - num025 - num2650 - num76100;}
            if (valor > 75 && valor < 101){
                num76100 = cont - num025 - num2650 - num5175;}
            if (valor < 0){
                break;
            }
            System.out.println("Numeros entre 0 e 25: " + num025);
            System.out.println("Numeros entre 26 e 50: " + num2650);
            System.out.println("Numeros entre 51 e 75: " + num5175);
            System.out.println("Numeros entre 76 e 100: " + num76100);
            System.out.println("Digite um número: " );
            Float numero = scanner.nextFloat();

            cont = i + 1;
            valor = numero;
        }

            }
        }