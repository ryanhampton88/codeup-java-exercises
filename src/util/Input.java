package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public void getString() {
        System.out.println("What is your name: ");
       String userInput = scanner.nextLine();
        System.out.println(userInput);
    }

    public boolean yesNo() {
        System.out.println("Did you have a good day? Yes or No?");
        String userInput = scanner.nextLine();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int userNumber = scanner.nextInt();
        if (userNumber < min || userNumber > max) {
            System.out.println("Choose a number within range.");
            getInt(min, max);
        } else {
            System.out.println(userNumber);

        }
        return userNumber;
    }

    public int getInt() {
        System.out.println("Enter an int:");
        int userNumber = scanner.nextInt();
        System.out.println(userNumber);
        return userNumber;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f: %n", min, max);
        double userNumber = scanner.nextDouble();
        if (userNumber < min || userNumber > max) {
            System.out.println("Choose a number within range.");
            getDouble(min, max);
        } else {
            System.out.println(userNumber);

        }
        return userNumber;
    }

    public double getDouble() {
        System.out.println("Enter a double: ");
        double userNumber = scanner.nextDouble();
        System.out.println(userNumber);
        return userNumber;
    }





}
