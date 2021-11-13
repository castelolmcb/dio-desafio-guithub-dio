import java.lang.System.Logger;
import java.util.Scanner;


public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        
    }
}
