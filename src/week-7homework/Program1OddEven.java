import java.util.Scanner;

public class Program1OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//creat scanner class object
        System.out.println("Enter input number ");//displaying heading
        int num = scanner.nextInt();// storing int in num varibale
        String result = (num % 2 == 0) ? "even" : "odd";// with ternary oprater  ? : display result with message
        System.out.println("Entered number is : " + result);
    }


}
