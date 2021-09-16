package Students;

import java.util.*;
import java.lang.Math;

public class StudentDB {

    private final Map<Integer, Students> students;


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

    public List<Students> list() {
        return new ArrayList<>(students.values());
    }

//    public HashMap<Integer, Students> randomStudent() {
//
//        students.
//        return students.get(((int)(Math.random() * students.size())));
//    }

    public void remove(int studentKey){
        students.remove(studentKey);
    }


}
