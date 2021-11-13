import java.util.Scanner;

public class exercicio4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int pares = 0;
        int impares = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();
    
        int count = 0;
        do {
            System.out.println("Numeros: ");
            numero = scan.nextInt();
            
            if (numero % 2 == 0) pares++;
            else impares++;
            
            count++;
        } while(count < quantNumeros);
        System.out.println("Quantidade par: " + (pares));
        System.out.println("Quantidade impar: " + (impares));
    }
}
