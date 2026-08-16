package Arrays;
import java.util.Scanner;

public class AvgOfArray {
    public static float avg(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        float average = sum/n;

        return average;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(avg(arr));
        input.close();
    }
}
