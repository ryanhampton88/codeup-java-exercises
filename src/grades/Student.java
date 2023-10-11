package grades;


import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

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
 }
