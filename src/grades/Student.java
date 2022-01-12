package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        double avg;
        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i) ;
        }
            avg = total / grades.size();
            return avg;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

//    public static void main(String[] args) {
//        Student stu1 = new Student("Student 1", new ArrayList<>());
//        stu1.addGrade(90);
//        stu1.addGrade(80);
//        stu1.addGrade(70);
//        stu1.addGrade(95);
//        System.out.println(stu1.grades);
//        System.out.println(stu1.getGradeAverage());
//
//    }

}
