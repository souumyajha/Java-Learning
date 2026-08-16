package Arrays;
import java.util.Scanner;

public class SmallestElementOfArray {
    public static int smallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Smallest Element: "+ smallest(arr));
        sc.close();
    }
}
