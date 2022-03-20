import java.util.Scanner;

///using city a to z alphabat and printing city name accordingly in console

public class Program9SwtichCasePro8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Alphabet A to F:");
        char city = obj.next("[a-zA-z]").charAt(0);
        switch(city){
            case 'A'|  'a':
                System.out.println("Ahmedabad");break;
            case'B'|'b':
                System.out.println("bombay");break;
            case 'c'|'C':
                System.out.println("culcutta");break;
            case 'd'|'D':
                System.out.println("dubai");break;
            case 'e'|'E':
                System.out.println("Egypt");break;
            case'f'|'F':
                System.out.println("faridabad");break;
            default:
                System.out.println("invalid entry ");
        }

    }
}
