import java.util.Scanner;

public class Program2LeapYear {
    public static void main(String[] args) {
        Program2LeapYear obj = new Program2LeapYear();
        obj.method();//callijng instance method

    }

    public void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");//display heading
        int year = scanner.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("IT is leap year: ");
        } else
            System.out.println(" IT is not leap year ");
    }
}

