package FirstWeekAssignments;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //FirstWeekAssignments.Shape example
        Rectangle rect = new Rectangle(10, 5); // Width = 10cm, Height = 5cm
        System.out.println("Area of the rectangle: " + rect.area() + " cm²");

        //FirstWeekAssignments.Student  example
        List<Integer> grades1 = List.of(85, 90, 78);
        List<Integer> grades2 = List.of(88, 92, 79);
        Student s1 = new Student("Renuka", 22, grades1);
        Student s2 = new Student("Aarav", 20, grades2);
        System.out.println("Initial:");
        s1.printStudentDetails();
        s2.printStudentDetails();

        // Change school name via class
        Student.schoolName = "AlwarDas Public School";
        System.out.println("After changing schoolName via Class:");
        s1.printStudentDetails();
        s2.printStudentDetails();

        //Change of Schoolname via instance
        s1.schoolName = "Sri Prakash Synergy School";
        System.out.println("After changing  schoolName via s1 instance:");
        s1.printStudentDetails();
        s2.printStudentDetails();

        //FirstWeekAssignments.Vehicle example
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start_engine();
        bike.start_engine();
    }
}
