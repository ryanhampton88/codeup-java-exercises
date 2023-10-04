package util;
import java.util.Scanner;

class Input {

    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

    public void getString() {
       String userInput = scanner.nextLine();
        System.out.println(userInput);
    }

    public boolean yesNo() {
        String userInput = scanner.nextLine();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
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
        int userNumber = scanner.nextInt();
        System.out.println(userNumber);
        return userNumber;
    }



    public static void main(String[] args) {

        Input input = new Input();
        input.getString();
        System.out.println(input.yesNo());
        input.getInt(1, 10);
    }
}
