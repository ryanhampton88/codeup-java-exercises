package grades;

import java.sql.SQLOutput;
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

        students.put("gitRyan", ryan);
        students.put("gitRoman", roman);
        students.put("gitRylan", rylan);
        students.put("gitCarmela", carmela);

        System.out.println("Select from the following menu options:");
        System.out.println("1. Type an individual student's name to view their record.");
        System.out.println("2. Type '2' to view ALL students' grades.");
        System.out.println("3. Type '3' to print a CSV report for all students.");
        for (String username : students.keySet()) {
            System.out.printf("%s | ", students.get(username).getName());
        }
        System.out.println();
        String userInput = userRequest.nextLine();

        double totalGradeAvg = 0;

        if (students.containsKey(userInput)) {
            System.out.println(students.get(userInput).getName());
            System.out.println(students.get(userInput).getGrades());
            System.out.println(students.get(userInput).getGradeAverage());
        } else if (userInput.equals("2")){
            for (String username : students.keySet()) {
                totalGradeAvg += students.get(username).getGradeAverage();
                System.out.printf("Student: %s%n grades: %s%n average: %s%n", username, students.get(username).getGrades(), students.get(username).getGradeAverage());

            }
            System.out.println("Overall class average: " + totalGradeAvg / students.size());
        } else if (userInput.equals("3")) {
            System.out.println("name,github_username,average");
            for (String username : students.keySet()) {
                System.out.printf("%s,%s,%.2f%n", students.get(username).getName(), username, students.get(username).getGradeAverage());
            }

        }

    }


}
