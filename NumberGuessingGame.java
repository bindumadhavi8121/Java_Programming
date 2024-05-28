import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println("random number is " + randomNumber);

        int tryCount = 0;

        while(true){
        System.out.println("enter your guess(1-100):");
        

        int playerGuess = scanner.nextInt();
        tryCount++;

        if(playerGuess == randomNumber){
            System.out.println("correct you win!");
            System.out.println("it took you" + tryCount + " tries ");
            break;
        }
        else if(randomnumber > playerGuess){
        System.out.println("nope! the number is higher.guess again.");
        }
        else {
            System.out.println("nope! the number is lower.guess again.");

        }
    }

    scanner.close();
        




    }
}
