package Projects;
import java.util.Scanner;

public class UnlimitedNumberGuessing{
  public static void game(){

    Scanner input = new Scanner(System.in);

    int number = 1 + (int)(Math.random()*100);
    int k = 5;

      System.out.println("You have to guess a number between 1 - 100.");
      System.out.println("You have " + k + " attempts.");

    int attempts = 0;

    while(true) {

        for (int i = 0; i < k; i++) {
            System.out.printf("Enter a number: ");
            int guess = input.nextInt();

            if (guess == number) {
                System.out.println("Congratulations!! Your guess was correct.");
                input.close();
                return;
            } else if (guess < number) {
                System.out.println("The number is greater than " + guess);
            } else {
                System.out.println("The number is lesser than " + guess);
            }
        }

        System.out.println("You are out of " + k + " attempts.");
        System.out.println("Do you want to continue the game yes/no : ");

        String response = input.next();

        if(!response.equalsIgnoreCase("yes")){
            System.out.println("Game over! The correct number was "+ number);
            break;
            }
        System.out.println("You have " + k + " more attempts");
        }
        input.close();
    }
    public static void main(String[] args){
      game();
    }
}
