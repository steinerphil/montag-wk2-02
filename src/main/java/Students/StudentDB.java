package Students;

import java.util.ArrayList;
import java.lang.Math;
import java.util.List;

public class StudentDB {

    private List students;


    public StudentDB(List students) {
        this.students = students;
    }

    public List getStudents() {
        return students;
    }

    public String list(){
        return students.toString();
    }

    public Object randomStudent() {
        return students.get((int) Math.floor(Math.random() * students.size()));
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
