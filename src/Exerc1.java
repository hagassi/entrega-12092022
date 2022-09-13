import javax.xml.transform.Result;

public class Exerc1 {
    public static void main(String[] args) {
        Integer Soma = 0;

        for (int i=0; i <=500; i++) {
            if (i % 2 != 0 && i % 3 == 0)
                Soma = Soma + i;
        }

            {
                System.out.println("O resultado da soma é:" +Soma);

            }




    }
}
