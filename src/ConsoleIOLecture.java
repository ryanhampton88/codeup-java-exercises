import java.util.Scanner;
public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohortName = "Fenrir";

        System.out.printf("Hey this is the %s cohort. %n One instructor is %s from the cohort and there are %d students in it.", cohortName, "Gilly", 12);

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
        String userInput = scanner.next();

        System.out.println("Your name is " + userInput + ".");
    }
}
