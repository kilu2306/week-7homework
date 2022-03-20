import java.util.Scanner;

public class Program5Salary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Salary slip ");
        System.out.println("Employee id");
        int id=scanner.nextInt();
        System.out.println("Employee name");
        String name=scanner.next();
        System.out.println("Basic salary ");
        int  salary=scanner.nextInt();
        int   hra= salary /10;
        System.out.println("HRA 10%" + hra);
        int  ta= salary*8/100;
        System.out.println("TA %"+ ta);
        int  da= salary *9/100;
        System.out.println("DA 9% "+ da);
        int  pf=salary*20/100;
        System.out.println("PF 20%"+ pf);
      int a=(salary+hra+ta+da)-pf;
        System.out.println("Gross salary "+"="+a);
        System.out.println("----------------------------------|");
        System.out.println("|          Salary Slip               |");
        System.out.println("|----------------------------------|");
        System.out.println("|Employer id      : "+id+ "          |");
        System.out.println("|Emplyoee Name      : "+name+ "      |");
        System.out.println("|----------------------------------|");
        System.out.println("|Basic Salary       :  "+salary+ "    | ");
        System.out.println("|HRA 10%            :   "+hra+ "      |");
        System.out.println("|TA 8%              :   "+ta+ "        |");
        System.out.println("|DA 9%              :   "+da + "       |" );
        System.out.println("|pf 20%             :   "+pf + "       |" );
        System.out.println("|----------------------------------|" );
        System.out.println("|Gross salary       :   |"+a+"         |" );
        System.out.println("|==================================|");






    }
}
