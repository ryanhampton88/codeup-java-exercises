import java.util.Scanner;
import java.io.*;
import java.lang.Integer;

public class ConsoleExercises {

    public static void main (String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is %.2f", pi);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite number?");
        int userInput = scanner.nextInt();
        System.out.println("User's answer is: " + userInput);

        Scanner threeWords = new Scanner(System.in);
        System.out.println("Input 3 words:");
        String userAnswer1 = threeWords.next();
        String userAnswer2 = threeWords.next();
        String userAnswer3 = threeWords.next();

        System.out.println(userAnswer1);
        System.out.println(userAnswer2);
        System.out.println(userAnswer3);

        Scanner sentence = new Scanner(System.in);
        System.out.println("How was your day?");
        String userResponse = sentence.nextLine();
        System.out.println(userResponse);

        System.out.println("Let's calculate the area for an area. Lol.");

        Scanner area = new Scanner(System.in);
        area.useDelimiter("\n");

        System.out.print("Enter width: ");
        String userWidth = area.nextLine();
        String userLength = area.nextLine();

        float parsedWidth = Float.parseFloat(userWidth);
        float parsedLength = Float.parseFloat(userLength);
        System.out.println("The area is " + parsedWidth * parsedLength);
        System.out.println("The perimeter is " + (2 * parsedWidth) + (2 * parsedLength));
        System.out.println("The volume is " + (parsedWidth * parsedLength) * 3);

    }


}
