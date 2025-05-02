package corebasics.week1class2.thisvariable;
class Person{
    int age;

    Person(){
        age = 22;
    }
    Person(int age){
        this.age = age ;
    }

    void ShowAge(){
        System.out.println("The FirstWeekAssignments.Student age is " + age);
    }
}
public class ThisMethod {
    public static void main(String[] args){
        Person obj = new Person();
        obj.ShowAge();
    }
}
