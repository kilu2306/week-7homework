public class Program19AverageValue {
    //calculate avarage value od array
    public static void main(String[] args) {
        int num[]=new int[6];
    num[0] = 100;
    num[1] = 200;
    num[2] = 300;
    num[3] = 400;
    num[4] = 500;
    num[5] = 600;
    int sum = 0;
    int length= num.length;
     for(int i=0;i< num.length;i++){
         sum =sum +num[i];
         System.out.println(sum);
     }
     int average = sum/length;
        System.out.println("average of array is : "+average);


}
}