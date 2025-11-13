package Packages.student;

public class Student{
    String name;
    int roll;

    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    public void displayStudent(){
        System.out.println("Student name: "+ name);
        System.out.println("Roll No. : "+roll);
    }
}
