package grades;


import java.util.ArrayList;
import java.util.HashMap;


public class Student {

    private String name;
    private ArrayList<Integer> grades;

    private HashMap <String, String> attendance = new HashMap<>();

public Student(String name) {
    this.name = name;
    this.grades = new ArrayList<>();
}

public ArrayList<Integer> getGrades(){
    return grades;
}
    // returns the student's name
    public String getName(){
    return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
    grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        int avg = 0;
        for (int i = 0; i < grades.size(); i++) {
            total = total + grades.get(i);
            avg = total / grades.size();
        }
          return avg;
        }

        public HashMap<String, String> recordAttendance(String date, String value){
            boolean isDate = false;
            String datePattern = "\\d{4}-\\d{1,2}-\\d{1,2}";
            if (date.matches(datePattern)){
                attendance.put(date, value);
            }
            System.out.println(attendance);
            return attendance;
        }
 }
