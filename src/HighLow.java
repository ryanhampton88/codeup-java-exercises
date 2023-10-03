import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        int count = 0;
        int random = (int) (Math.random() * 100 - (1 + 1) + 1);
       guessTheNumber(random, count);

    }
    public static void guessTheNumber(int random, int count) {
        count += 1;
        Scanner guessNumber = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100:");
        int userGuess = guessNumber.nextInt();
            if (userGuess < random) {
                System.out.println("HIGHER");
                guessTheNumber(random, count);
            } else if (userGuess > random) {
                System.out.println("LOWER");
                guessTheNumber(random, count);
            } else {
                System.out.println("You won! Your guess of " + userGuess + " matches " + random + "!");
                System.out.println("It took you " + count + " times.");
            }
//                return userGuess;
    }

}
