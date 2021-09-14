package Students;

import java.util.Arrays;
import java.lang.Math;

public class StudentDB {

    private Student[] students;


    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public String list() {
        return Arrays.toString(students);
    }

    public Student randomStudent() {
        return students[(int) Math.floor(Math.random() * students.length)];
    }

    public boolean remove(int studentIdToRemove){
        boolean check = false;
        for(int i = 0; i < students.length; i++){
            if(students[i].getId()== studentIdToRemove){
                System.out.println("Student " + students[i].getName() + " removed.");
                students[i] = null;
                check = true;
            }
        }
        if (!check){
            System.out.println("Student with ID " + studentIdToRemove + " not found.");
        }
        return check;
    }

}
