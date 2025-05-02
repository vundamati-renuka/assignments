package corebasics.week1class2.thisvariable;

class Student{
    String name ;


Student(String name){
    this.name = name ;
}

void display(){
    System.out.println("FirstWeekAssignments.Student Name is "  + this.name);
}
}
public class ThisDemo {
    public static void main(String[] args) {
        Student obj = new Student("Renuka");
        obj.display();
    }

}

