import java.util.Scanner;

public class Program4DaysInMonth {
    public static boolean isLeapYear(int year) {
        boolean result;
        if (year >= 1 && year <= 9999) {
            result = true;
            if ((year % 4 == 0) && (year % 100 != 00) || (year % 400 == 00)) {
                result = true;
                System.out.println(year + " year is leap year  ");
            } else {
                result = false;
                System.out.println(year + "Year is not leap year  ");
            }
        } else {
            result = false;
            System.out.println(year + " this parameter is not in range (1-9999");
        }
        return result;

    }

    public int getDaysInMonth(int month, int year) {
        int day;

        switch (month) {
            case 1:
                day = 31;
                break;
            case 2:
                boolean result = isLeapYear(year);
                if (result == true) {
                    day = 29;
                } else day = 28;
                break;
            case 3:
                day = 31;
                break;
            case 4:
                day = 30;
                break;
            case 5:
                day = 31;
                break;
            case 6:
                day = 30;
                break;
            case 7:
                day = 31;
                break;
            case 8:
                day = 30;
                break;
            case 9:
                day = 31;
                break;
            case 10:
                day = 30;
                break;
            case 11:
                day = 31;
                break;
            case 12:
                day = 30;
                break;
            default:
                day = -1;
        }
        return day;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter LeapYear");//display leap year
        int a = scanner.nextInt();
        System.out.println(isLeapYear(a));
        System.out.println("Enter month");//display month
        int month = scanner.nextInt();
        System.out.println("Enter the year");//displayname
        int year = scanner.nextInt();
        Program4DaysInMonth obj = new Program4DaysInMonth();//creat object  for calling with return with parameter instance method
        System.out.println("month " + month + "  has " + obj.getDaysInMonth(month, a)+ "days");


    }
}
