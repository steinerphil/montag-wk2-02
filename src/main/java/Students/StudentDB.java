package Students;

import java.security.PublicKey;
import java.util.Arrays;
import java.lang.Math;

public class StudentDB {

    private final Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "all known students= " + Arrays.toString(students) +
                '}';
    }

    public String list() {
        return Arrays.toString(students);
    }

    public Student randomStudent() {
        return students[(int) Math.floor(Math.random() * students.length)];
    }

    public boolean remove(Student studentToRemove){

    }
}
