import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int cont = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma += numero;
            if (numero > maior) maior = numero;

            cont += 1;
        } while(cont < 5);

        System.out.println("O maior número é:" + (maior));
        System.out.println("A média é: " + (soma/5));
    }
}
