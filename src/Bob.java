import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);

        System.out.println("Ask Bob anything...");

        String bobResponse = "";

        while (true) {
            String userQuestion = question.nextLine();


            if (userQuestion.endsWith("?")) {
                bobResponse = "Sure!";
            } else if (userQuestion.endsWith("!")) {
                bobResponse = "Whoa, chill out!";
            } else if (userQuestion.isEmpty()) {
                bobResponse = "Fine. Be that way.";
                break;
            } else {
                bobResponse = "Whatever";
            }

            System.out.println(bobResponse);
        }
    }
}
