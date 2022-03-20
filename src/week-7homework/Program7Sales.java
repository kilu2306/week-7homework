import java.util.Scanner;

public class Program7Sales {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);//scanner object
        System.out.println("Enter sales id");//display heading
        int id = obj.nextInt();//storing value
        System.out.println("Enter saller name :");//heading display
        String name = obj.next();//storing value
        System.out.println("sales Amount :");//heading display
        int sales = obj.nextInt();//storing value
        System.out.println("Salary basic :");//heading display
        int salary = obj.nextInt();
        System.out.println("Sales Commission:--->");
        int commision ;
        if (sales >= 50000) {//for loo
            commision = 50000 * 35 / 100;
            System.out.println(commision);
        } else if (sales >= 30000 && sales < 50000) {
            commision = 30000 * 20 / 100;
            System.out.println(commision);
        } else if (sales >= 20000 && sales < 30000) {
            commision = 20000 * 10 / 100;
            System.out.println(commision);
        } else if (sales >= 10000 && sales < 20000) {
            commision = 10000 * 5 / 100;
            System.out.println(commision);

        } else commision = 10000 * 2 / 100;
        {System.out.println(commision);}


    }
}
