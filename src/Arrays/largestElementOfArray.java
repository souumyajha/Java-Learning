package Arrays;
import java.util.Scanner;

public class largestElementOfArray {
    public static int largest(int[] arr){
        int largest = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest Element: "+ largest(arr));
        sc.close();
    }
}
