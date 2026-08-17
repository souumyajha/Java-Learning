package Numbers;
import java.util.Scanner;

public class LargestOf2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Same");
        }else if (a < b){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
        sc.close();
    }
}
