package Arrays.Searching;
import java.util.Scanner;

public class LinearSearch {
    public static int searchElement(int[] arr , int target){

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(searchElement(arr , target));
        sc.close();
    }
}
