import java.util.Scanner;

public class Program13Number1To7Switch {
    //program to know by entering 1-7 accordingly which week day

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7 : ");//display heading
        int input = obj.nextInt();//object creation
        switch (input) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuseday");break;
            case 3:
                System.out.println("Wednesday");break;
            case 4:
                System.out.println("Thursday");break;
            case 5:
                System.out.println("Friday");break;
            case 6:
                System.out.println("saturday");break;
            case 7:
                System.out.println("sunday");break;
            default:
                System.out.println("Week contains 1 to 7 days");break;
        }
    }


}

