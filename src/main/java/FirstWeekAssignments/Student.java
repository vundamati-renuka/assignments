package FirstWeekAssignments;

import java.util.List;

public class Student {
    String name;
    int age;
    List<Integer> grades;
    static String schoolName = "Visakha Valley School";

    public Student(String name , int age ,  List<Integer> grades){
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public double calculateAverage(){
        if(grades == null || grades.isEmpty()){
            return 0.0 ;
        }

        int sum = 0 ;
        for(int grade : grades){
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + schoolName);
        System.out.println("Grades: " + grades);
        System.out.printf("Average Marks: %.2f%n", calculateAverage());
    }
}