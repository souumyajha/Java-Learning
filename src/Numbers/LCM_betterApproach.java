package Numbers;
import java.util.Scanner;
public class LCM_betterApproach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int originalA = a;
        int originalB = b;

        while(b != 0){
            int temp = b ;
            b = a%b;
            a = temp;
        }
        int gcd = a;

        int lcm = (originalA * originalB) / gcd;
        System.out.println(lcm);

        sc.close();
    }
}
