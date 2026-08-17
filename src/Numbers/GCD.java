package Numbers;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;

        for(int i = Math.min(a,b) ; i > 1 ; i--){
            if( a % i == 0 && b % i == 0){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
        sc.close();
    }
}
