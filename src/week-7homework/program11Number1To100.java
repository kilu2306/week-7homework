public class program11Number1To100 {
    public static void main(String[] args) {
        //write java code to print 1 to 100 number which can be devide by 3 and 5
   program11Number1To100 obj= new program11Number1To100();
   obj.method();//calling return type method

    }

    public int method() { //return type method
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }

        }
        return 0;

    }
}




