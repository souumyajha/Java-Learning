package Arrays;
import java.util.Scanner;

public class reverseArr {
    public static void reverse(int[] arr){
        int n = arr.length;
        int i = 0 ;
        int j = n-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for(int nums : arr){
            System.out.print(nums + " ");
        }
    }
}
