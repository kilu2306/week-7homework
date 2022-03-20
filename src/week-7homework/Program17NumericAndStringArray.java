public class Program17NumericAndStringArray {
    public static void main(String[] args) {

        //numeric array
        int a[]={ 100,200,300,400,500,600};
        System.out.println(a[3]);//400
        System.out.println(a[0]);//100
        System.out.println(a[5]);//600
//string array
        String b[]=new String[7];
        b[0]="monday";
        b[1]="Tuseday";
        b[2]="Wednesday";
        b[3]="Thursday";
        b[4]="Friday";
        b[5]="saturday";
        b[6]="sunday";

        System.out.println(b.length);//7
        System.out.println(b[5]);//friday

    }
}
