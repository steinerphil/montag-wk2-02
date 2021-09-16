package Main;

import Exceptions.StudentNotRemovedException;
import Students.HistoryStudent;
import Students.MathStudent;
import Students.StudentDB;
import Students.Students;

import java.util.ArrayList;
import java.util.Optional;

public class Main {


    public static void main(String[] args) {
        //Create Student DB
        StudentDB students = new StudentDB(new ArrayList<>());
        //Create Students and add to List of Students
        students.add(new MathStudent("Peter", 1));
        students.add(new HistoryStudent("Maria", 2));
        students.add(new MathStudent("Hans", 3));

        System.out.println(students.list());


        //Use StudentDB method

        try {
            students.add(new MathStudent("Peter", 4)); // throws exception
        }
        catch (RuntimeException e){
            e.printStackTrace();// program do not crash because catch
        };


        try {
            students.remove(1);
        } catch (StudentNotRemovedException e) {
            e.printStackTrace();
        }

        System.out.println(students.list());

        System.out.println("random: " + students.randomStudent().toString());


        //run Optionals
        Optional<Students> match = students.getById(6);
        if (match.isPresent()){
            System.out.println("its a match: " + match.get().getName());
        } else {
            System.err.println("Not match in Students Map");
        }


    }

}
