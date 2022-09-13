import java.util.Scanner;


public class Exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maiorAltura = 0;
        double menorAltura = 999;

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite a " + (i + 1) + "ª altura: ");
            Double altura = scanner.nextDouble();
            if (maiorAltura < altura) {
                maiorAltura = altura;
            }
            if (menorAltura > altura) {
                menorAltura = altura;
            }

        }

        System.out.println("A maior altura é: " + maiorAltura);
        System.out.println("A menor altura é: " + menorAltura);
    }

}
