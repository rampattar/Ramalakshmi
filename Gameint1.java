import java.util.Scanner;
import java.util.Random;

public class Gameint1
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  Random random = new Random();
  int minRange = 1;
  int maxRange = 100;
  int maxAttempts = 5;
  int score = 0;
  System.out.println("Welcome to the Guess the Number Game!");
  do 
  {
   int generatedNumber = random.nextInt(maxRange) + minRange;
   System.out.println("A number between 1 and 100 has been generated. You have " + maxAttempts + "attempts.");
   for (int attempts = 1; attempts <= maxAttempts; attempts++) 
   {
    System.out.print("Attempt " + attempts + ": Enter your guess: ");
    int userGuess = s.nextInt();
    if (userGuess == generatedNumber)
    {
     System.out.println("Congratulations! You guessed the correct number.");
     score++;
     break;
     }
    else if (userGuess < generatedNumber) 
    {
     System.out.println("Too low! Try a higher number.");
     }
    else
    {
     System.out.println("Too high! Try a lower number.");
     }
    if (attempts == maxAttempts)
    {
     System.out.println("Sorry, you've used all your attempts. The number was: " + generatedNumber);
     }
    }
    System.out.print("Do you want to play again? (yes/no): ");
    String playAgain = s.next();
    if (!playAgain.equalsIgnoreCase("yes"))
    {
     break;
      }
     }while (true);
     System.out.println("Game over. Your score: " + score);
     s.close();
    }
}
