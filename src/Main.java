import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner length = new Scanner(System.in);
        String[] alphabet ={"A", "B" , "C", "D" , "E", "F" , "G", "H", "I", "J" , "K",
        "L", "M" , "N" , "O" ,"P", "Q", "R", "S", "T", "U", "V", "W","X","Y","Z"};
        String toContinue = "y";
        int index = r.nextInt(alphabet.length);
        while(!toContinue.equalsIgnoreCase("n")) {
            System.out.println("Enter length of Word");
            int wordLength  = length.nextInt();

            for( int i = 0; i < wordLength ; i++) {
                index = r.nextInt(alphabet.length);
                System.out.println(alphabet[index]);
            }

            if(alphabet[index].equalsIgnoreCase("A") || alphabet[index].equalsIgnoreCase("E") || alphabet[index].equalsIgnoreCase("I") || alphabet[index].equalsIgnoreCase("O") || alphabet[index].equalsIgnoreCase("U")) {
                System.out.println(alphabet[index]);
                System.out.println("might be a word");
            } else {
                System.out.println("is not a word");

            }

            System.out.println("continue?(y/n)");
            length.nextLine();
            toContinue = length.nextLine();

        }



    }
}
