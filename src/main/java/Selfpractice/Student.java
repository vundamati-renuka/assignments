package Selfpractice;

public class Student {
    String name;
    int rollNumber;

    public Student(String name , int rollNumber){
        this.name = name ;
        this.rollNumber = rollNumber;
    }

    void showStudentDetails(){
        System.out.println("My Student details are " + "Name: " +name   + "  RollNumber is " + rollNumber);
    }

    public static void main(String[] arg){
        Student details = new Student("maniDeep" ,34);
        details.showStudentDetails();
    }
}
