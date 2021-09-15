package Main;

import Students.HistoryStudent;
import Students.MathStudent;
import Students.Student;
import Students.StudentDB;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //Vars
        List<Student> students = new ArrayList<>();

        //Create Students and add to ArrayList of Students
        students.add(new MathStudent("Peter", 2));
        students.add(new HistoryStudent("Maria", 5));
        students.add(new MathStudent("Hans", 9));

        //Create a StudentDB
        StudentDB allStudents = new StudentDB(students);

        //Use StudentDB method
        System.out.println(allStudents.list());

    }

}
