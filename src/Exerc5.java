import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float impares = 0;
        float pares = 0;
        float media = 0;
        float mediaPar = 0;
        float numero = 0;
        float cont = 0;
        float soma = 0;
        float somaPares = 0;
        float somaImpares = 0;

        for (int i = 0; i <= Float.MAX_VALUE ; i++) {
            if (numero % 2 == 0){
                pares = cont - impares;
            somaPares = soma - somaImpares;}
            if (numero % 2 != 0){
                impares = cont - pares;
            somaImpares = soma - somaPares;}

            mediaPar = somaPares / pares;

            System.out.println("Números pares: " + pares);
            System.out.println("Números impares: " + impares);
            System.out.println("Média pares: " + mediaPar);
            System.out.println("Média geral: " + media);
            System.out.println("Digite um valor: ");

            Float valor = scanner.nextFloat();

            if (valor == 0){
                break;}

            numero = valor;
            cont = i + 1;
            soma = soma + valor;
            media = soma / cont;

        }
        }
}
