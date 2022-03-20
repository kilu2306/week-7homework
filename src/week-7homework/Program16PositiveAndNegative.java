import java.util.Scanner;

public class Program16PositiveAndNegative {
    //to check if number is positive ,negative or zero
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numeber:");
        int number=scanner.nextInt();//created object

        //if else if condition
        if (number>0){
            System.out.println(" Number is positive :"+number);}
            else if(number<0){
                System.out.println("Number is negative :"+number);
            }else if(number==0){
            System.out.println("Number is zeero:"+ number );
        }


    }
}
