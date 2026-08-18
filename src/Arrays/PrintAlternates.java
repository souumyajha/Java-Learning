package Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class PrintAlternates {
    public static ArrayList<Integer> getAlternate(int[] arr){

        int n = arr.length;

        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0 ; i < n ; i += 2){
            a.add(arr[i]);
        }
        return a;
    }
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> alternates = getAlternate(arr);
        for(int element : alternates){
            System.out.println(element);
        }
        sc.close();
    }
}
