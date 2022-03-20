public class Program20ArraySpecificValue {
    //write program if array contain any specific value
    public static void main(String[] args) {
        //intialize array
        int[] number = {1, 5, 8, 4, 11, 45};
        int search = 11;//specific value
        boolean result = false;

        for (int n : number) {
            if (n == search) {
                result = true;
                break;
            }
        }
        if (result)
            System.out.println(search + " is found ");
        else System.out.println((search + " is not found "));
    }
}