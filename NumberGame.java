import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        boolean play = true;
        //fixing the upper and lower bound for the random number
        int upperBound = 100;
        int lowerBound = 1;
        //limiting the maximum number of attempts to 7
        int maxAttempts = 7;
        int rounds = 0;
        int score = 0;

        while(play){
            //generating the random number
            int num = rd.nextInt(upperBound - lowerBound + 1)+ lowerBound;
            int attempts = 0;

            System.out.println("ROUND "+(rounds+1));
            System.out.println("Guess a number between 1 and 100");

            while(attempts < maxAttempts){
                System.out.println("Enter your guess: ");
                //input a number from the user
                int guess = sc.nextInt();
                //incrementing the attempts for each guess of the user
                attempts++;

                if(guess == num){
                    System.out.println("You guessed the correct number in "+ attempts +" attempts");
                    //calculating score at the time of correct guess
                    score += maxAttempts - attempts +1;
                    break;
                }
                //Try again if randomly generated number and the guess of user are not same
                else if(guess < num){
                    System.out.println("Too low. Try again");
                }
                else{
                    System.out.println("Too high. Try again");
                }
            }
            rounds++;
            //continue to next round if user enters "YES"
            System.out.println("Do you want to play again? (YES/NO)");
            String choice = sc.next();
            play = choice.equalsIgnoreCase("yes");
        }
        /*Display the number of attempts and the final score of the user,
          if he does not wish to proceed to the next round */
        System.out.println("GAME OVER");
        System.out.println("Total rounds played: "+rounds);
        System.out.println("Final score: "+score);
        sc.close();
    }
}