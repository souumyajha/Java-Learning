package Numbers;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = Math.max(a,b);
        int lcm ;

        while(true){
            if( i % a == 0 && i % b == 0){
                 lcm = i;
                 break;
            }
            i++;
        }
        System.out.print(lcm);
        sc.close();
    }
}
