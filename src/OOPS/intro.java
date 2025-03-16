package OOPS;

import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
        // create an array of all objects created for class students
        // Student[] students = new Student[5];

        // create object
        // Student s1 = new Student();

       /*
       s1.rno = 28;
        s1.name = "charita";
        s1.marks = 98.7f; */

        // instead of declaring separately use constructor  and pass values
        Student s1 = new Student(28,"veera",98.6f);

        s1.greeting();

        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        System.out.println();

        //Student s2 = new Student(30,"kunaal",87.5f);

        // using constructor overloading
        // here s2 refers to this keyword in function
        // and s1 refers to the other
        Student s2 = new Student(s1);
        s2.greeting();

        System.out.println(s2.rno);
        System.out.println(s2.name);
        System.out.println(s2.marks);

        System.out.println();

        Student s3 = new Student();
        System.out.println(s3.name);
    }
}

class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello!! My name is "+ this.name);
    }

    //constructor overloading
    // a constructor that takes the value from another object
    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }


    // call another constructor inside a constructor
    Student(){
        this (13,"default person",100.0f);
    }
    // a keyword to access values from every object
    // using constructor;
    Student(int newRno,String newName,float newMarks){
        this.rno = newRno;
        this.name = newName;
        this.marks = newMarks;
    }
}
