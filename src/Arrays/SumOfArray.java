package Arrays;
import java.util.Scanner;

public class SumOfArray {
//    public int Sum(int[] arr){
      public static int Sum(int[] arr){
       int n = arr.length;
       int sum = 0 ;
       for(int i = 0 ; i < n ; i++){
           sum += arr[i];
       }
       return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

//        SumOfArray obj = new SumOfArray();
//        System.out.println(obj.Sum(arr));
        System.out.println(Sum(arr));
        input.close();
    }
}
