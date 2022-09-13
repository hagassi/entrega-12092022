import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float soma = 0;
        float numero1 = 0;
        float numero2 = 0;
        float valorPos = 0;
        float valorNeg = 0;
        float numero = 0;
        float mediaAritimetica = 0;
        float porcPos = 0;
        float porcNeg = 0;
        float pos = 0;
        float neg = 0;
        Integer limite = Integer.MAX_VALUE;

        for (int i = 0; i <= limite ; i++) {
            if (pos >= valorPos){
                numero1 = numero - numero2;}
            if (neg < valorNeg){
                numero2 = numero - numero1;}
            porcPos = (numero1 * 100) / numero;
            porcNeg = (numero2 * 100) / numero;

            System.out.println("Media aritimética: " + mediaAritimetica);
            System.out.println("Quantidade positivos: " + numero1);
            System.out.println("Quantidade negativos: " + numero2);
            System.out.println("Percentual positivo: " + porcPos + "%");
            System.out.println("Percentual negativo: " + porcNeg + "%");
            System.out.println("Digite um valor: ");
            Float valor = scanner.nextFloat();

            neg = valor;
            pos = valor;
            numero = (i+1);
            soma = soma + valor;
            mediaAritimetica = soma / numero;

        }
        }
    }