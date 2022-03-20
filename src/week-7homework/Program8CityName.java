import java.util.Scanner;

public class Program8CityName {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Alphabet A to F:");
        char c = obj.next("[a-zA-z]").charAt(0);//using string method to declaring first alphabate by using charat index number


        //using || or coprater
        if (c == 'a' || c == 'A') {
            System.out.println("Ahmedabad");
        } else if (c == 'b' || c == 'B') {
            System.out.println("bombay");
        } else if (c == 'd' || c == 'D') {
            System.out.println("Dandi");

        } else if (c == 'e' || c == 'E') {
            System.out.println("Edingburg");

        } else if (c == 'f' || c == 'F') {
            System.out.println("Faridabad");
        }
        else
            System.out.println("invalid city ");
    }
}
