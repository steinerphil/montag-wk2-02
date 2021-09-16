package Main;

import Students.HistoryStudent;
import Students.MathStudent;
import Students.StudentDB;
import Students.Students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        //Vars
        Map<Integer, Students> students = new HashMap<>();

        //Create Students and add to ArrayList of Students
        students.put(1, new MathStudent("Peter", 1));
        students.put(2, new HistoryStudent("Maria", 2));
        students.put(3, new MathStudent("Hans", 3));

        //Create a StudentDB
        StudentDB allStudents = new StudentDB(students);
        System.out.println(allStudents.list());


        //Use StudentDB method

        try {
            allStudents.add(new MathStudent("Peter", 2)); // throws exception
        }
        catch (RuntimeException e){
            System.err.println("error, the student you are trying to add already exists");  // program do not crash because catch
        };

        System.out.println(allStudents.list());


    }

}
