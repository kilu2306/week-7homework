import java.util.Scanner;

public class Program6OddEven {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);//creat object
        int num, reminder; //declare variable
        System.out.println("Enter any number :");//display heading
        num = obj.nextInt();
        reminder = num % 2;

        if (reminder == 0) {//condition

            System.out.println("its even number ");
        } else {
            System.out.println("its odd number ");
        }
    }
}
