import java.util.Scanner;

public class Program12AlphabetOrSymbol {
    public static void main(String[] args) {
        //program to know s input value is number or an alphabet or symbol.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any value:");
        //checking for alphabate
        char value = scanner.next().charAt(0);
        if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122)) {
            System.out.println("Its a Alphabet");
        }
        //checking digit
        else if ((value >= 48 && value <= 57)) {
            System.out.println("its  DIGIT");
        }
        //cheking symbol
        else
            System.out.println("its symbol");

        }

    }

