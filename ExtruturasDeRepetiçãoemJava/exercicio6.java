import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o número do fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;
        System.out.println(fatorial + "! = ");

        for (int i = fatorial; i >= 1 ; i -- ) {

        multiplicacao = multiplicacao * i;


        }
        System.out.println(multiplicacao);
    }
}
