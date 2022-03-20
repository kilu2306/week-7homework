import java.util.Scanner;

public class program10SymbolMath {
    //enter 2 number and  symbol and calculation will be done acordingly symbol
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter first number:" );
        int a=obj.nextInt();
        System.out.println("Enter second number :");
        int b= obj.nextInt();
        System.out.println("Enter any symbol from:+,-,/,* ");
        char c=obj.next().charAt(0);
        int d;
        if(c=='+'){
            d= a+b;
            System.out.println("Addition both number is: "+ d);
        }
        else if (c=='-'){
            d=a-b;
            System.out.println("Subtraction of both number is : "+d);

        }else if(c=='*'){
            d=a*b;
            System.out.println("Multiplication of both numner is : "+d);

        }else if  (c=='/'){
            d=a/b;
            System.out.println("division of both number is: "+ d);
        }
    }

}
