package Numbers;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        while(temp > 0){
            count++;
            temp /= 10;
        }
        temp = n;
        int sum = 0 ;

        while(temp > 0){
            int d = temp % 10;
            sum += (int)Math.pow(d , count);
            temp /= 10;
        }

        if (n == sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}
