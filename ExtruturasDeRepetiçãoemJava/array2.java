import java.util.Scanner;

public class array2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count =0 ;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            String anotherString;
            if ( !(letra.equalsIgnoreCase( anotherString: "a") |
                   letra.equalsIgnoreCase( anotherString: "e") |
                   letra.equalsIgnoreCase( anotherString: "i") |
                   letra.equalsIgnoreCase( anotherString: "o") |
                   letra.equalsIgnoreCase( anotherString: "u")) ) {
                    
                    consoantes[count] = letra;
                    quantidadeConsoantes++;

                }

                count++;

        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for  ( String consoante : consoantes ) {

            System.out.println(consoante + "");

        }


    }
}
