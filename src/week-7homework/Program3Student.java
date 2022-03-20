import java.util.Scanner;

public class Program3Student {
    public static void main(String[] args) {
        method1();

    }

    private static void method1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name :");
        String name = scanner.next();
        System.out.println("roll no:  ");
        int num = scanner.nextInt();
        System.out.println("subject name :");

        System.out.println("maths");
        int sub1 = scanner.nextInt();
        System.out.println("science");
        int sub2 = scanner.nextInt();
        System.out.println("English");
        int sub3 = scanner.nextInt();
        int total = sub1 + sub2 + sub3;
        int per = total / 3;
        String result = "";
        String grade = "";

        int mark = 0;
        if (mark > 0 && mark < 100) {
            System.out.println("valid input ");

        } else {
            System.out.println("mark shoul between 0 to 100");
        }
        // making for loop for passing grade
        if (per >= 80) {
            result = result + "pass";
            System.out.println(result);
            grade = grade + "A+";
            System.out.println(grade);
        } else if (per >= 60 && per < 80) {
            result = result + "pass";
            System.out.println(result);
            System.out.println(grade + "A");
        } else if (per >= 50 && per < 60) {
            result = result + "pass";

            System.out.println(result);
            grade = grade + "c";
            System.out.println(grade);
        } else {
            result = result + "fail";
            System.out.println(result + "fail ");
            grade = grade + "c";
            System.out.println(grade + "c");
        }


        System.out.println("----------------------------------------");
        System.out.println("|                                       |");
        System.out.println("|              Marksheet                |");
        System.out.println("|                                       |");
        System.out.println("----------------------------------------");

        System.out.println("|           name        :    " + name + "       |");
        System.out.println("|           Rolll No:   :    " + num + "        |");
        System.out.println("|          Subjects     :    " + " Marks " + "   |");
        System.out.println("|-------------------------------------|");
        System.out.println("|          Math          :    " + sub1 + "       |");
        System.out.println("|          Science       :    " + sub2 + "       |");
        System.out.println("|         English        :    " + sub3 + "       |");
        System.out.println("|---------------------------------------|");
        System.out.println("|          Total         :    " + total + "      |");
        System.out.println("|--------------------------------------- |");
        System.out.println("|         Percentage     :     " + per + "       |");
        System.out.println("|         Result         :     " + result + "     |");
        System.out.println("|         Grade          :     " + grade + "       |");


    }
}
