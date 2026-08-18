package Arrays.Searching;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr , int target){

        int beg = 0;
        int end = arr.length - 1;

        while( end >= beg ){
            int mid = (beg + (end - beg)) / 2;

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                beg = mid + 1;
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

        System.out.println(binarySearch(arr , target));
        sc.close();
    }
}
