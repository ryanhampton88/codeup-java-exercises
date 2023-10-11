package grades;

import java.util.*;


public class GradesApplication {

    public static void main(String[] args) {

        Scanner userRequest = new Scanner(System.in);


        Student ryan = new Student("Ryan");
        ryan.addGrade(50);
        ryan.addGrade(100);
        ryan.addGrade(75);

        Student roman = new Student("Roman");
        roman.addGrade(90);
        roman.addGrade(97);
        roman.addGrade(90);

        Student rylan = new Student("Rylan");
        rylan.addGrade(90);
        rylan.addGrade(97);
        rylan.addGrade(90);

        Student carmela = new Student("Carmela");
        carmela.addGrade(90);
        carmela.addGrade(97);
        carmela.addGrade(90);


        HashMap <String, Student> students = new HashMap<>();

        students.put("ryan", ryan);
        students.put("roman", roman);
        students.put("rylan", rylan);
        students.put("carmela", carmela);

        System.out.println("Select an individual student to view their record or select ALL:");
        System.out.println(students.keySet());
        String userInput = userRequest.nextLine();

        if (students.containsKey(userInput)) {
            System.out.println(students.get(userInput).getName());
            System.out.println(students.get(userInput).getGrades());
            System.out.println(students.get(userInput).getGradeAverage());
        } else if (userInput.equalsIgnoreCase("All")){
            for (String username : students.keySet()) {
                System.out.printf("Student: %s%n grades: %s%n average: %s%n", username, students.get(username).getGrades(), students.get(username).getGradeAverage());
            }
        } else {
            System.out.println("Student not found.");
        }

    }


}
