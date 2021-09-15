package Main;

import Students.HistoryStudent;
import Students.MathStudent;
import Students.Student;
import Students.StudentDB;

public class Main {

    public static void main(String[] args) {
        //Create Students from interface
        Student[] students = new Student[3];
        students[0] = new MathStudent("Peter", 2);
        students[1] = new HistoryStudent("Anja", 3);
        students[2] = new MathStudent("Nele", 20);

        //Create a StudentDB
        StudentDB allStudents = new StudentDB(students);

        // test interface methods
        System.out.println(students[0].getNc());
        System.out.println(allStudents.list());
        System.out.println(students[0].getUniName());
    }

}
