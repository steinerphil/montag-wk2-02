package Main;

import Students.Student;
import Students.StudentDB;

public class Main {

    public static void main(String[] args) {
        //Create Students
        Student[] students = {
                new Student("Hans", 01),
                new Student("Peter", 02),
        };

        //Create a StudentDB
        StudentDB allStudents = new StudentDB(students);


        //Method Tests
        System.out.println(allStudents.list());
        System.out.println(allStudents.randomStudent());

    }

}
