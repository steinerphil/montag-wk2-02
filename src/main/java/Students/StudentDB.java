package Students;

import java.util.Arrays;
import java.lang.Math;
import java.util.Map;

public class StudentDB {

    private Map students;


    public StudentDB(Map<Integer, Students> students) {
        this.students = students;
    }

    public Map<Integer, Students> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return students.toString();
    }

    public String list() {
        return students.toString();
    }

    public Object randomStudent() {
        return students.get(((int) Math.floor(Math.random() * students.size())));
    }

//    public boolean remove(int studentIdToRemove){
//        boolean check = false;
//        for(int i = 0; i < students.length; i++){
//            if(students[i].getId()== studentIdToRemove){
//                System.out.println("Student " + students[i].getName() + " removed.");
//                students[i] = null;
//                check = true;
//            }
//        }
//        if (!check){
//            System.out.println("Student with ID " + studentIdToRemove + " not found.");
//        }
//        return check;
//    }

}
