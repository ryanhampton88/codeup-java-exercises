import java.util.Scanner;
import java.lang.Math;

public class MethodExercises {
    public static void main(String[] args) {

//        System.out.println(multiply(2, 3));
//        int userInput = getInteger(1, 10);
//        long factorial = getFactorial(userInput);
//        System.out.println(factorial);

        int dice1 = rollDice();
        int dice2 = rollDice();
        System.out.println(dice1);
        System.out.println(dice2);

    }

    public static int addition(int input1, int input2) {
        return input1 + input2;
    }

    public static int subtraction(int input1, int input2) {
        return input1 - input2;
    }

    public static int multiply(int input1, int input2) {
        int sum = 0;
        for (int i = 1; i <= input1; i++) {
             sum = sum + input2;
        }
return sum;
}
    public static int divide (int input1, int input2) {
        return input1 / input2;
    }

    public static int modulus (int input1, int input2) {
        return input1 % input2;
    }


    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.printf("Wrong number. Enter a number between %d and %d%n", min, max);
            getInteger(min, max);
        }
        return userInput;
    }

    public static int getFactorial (int userInput) {
//
        if (userInput == 0) {
            return 1;
        } else {
            return userInput * getFactorial(userInput - 1);
        }
    }

        public static int rollDice () {
            int min = 1;
            int max = 6;
            int range = max - (min + 1);
            int random = (int)(Math.random() * range) + min;
            return random;
        }


}
