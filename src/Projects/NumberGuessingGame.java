package Projects;

import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = 1+ (int)(Math.random()*100);
        int k = 10;

        System.out.println("You have to guess the number between 1-100");
        System.out.println("You have "+k+" attempts");

        for(int i = 0 ; i < k ; i++) {
            System.out.println("Guess the number: ");
            int guess = input.nextInt();

            if (guess == number) {
                System.out.println("Congratulations!! Your guess was right!");
                input.close();
                return;
            } else if (guess < number) {
                System.out.println("The number is greater than " + guess);
            } else {
                System.out.println("The number is less than " + guess);
            }
        }
        System.out.println("You are out of all attempts the correct answer was "+number);
        input.close();
    }
}