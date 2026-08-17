package Numbers;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Math.abs(sc.nextInt());


        int cnt = 0;

        if(n == 0){
            cnt = 1;
        }
        while(n > 0){
            cnt++;
            n /= 10;
        }

        System.out.println(cnt);
        sc.close();
    }
}
