package Students;

import Exceptions.StudentNotRemovedException;

import java.util.*;
import java.lang.Math;

public class StudentDB {

    private final Map<Integer, Students> students = new HashMap<>();

    //Constructors
    public StudentDB(List <Students> student) {
        add(student);
    }

    //getter
    public Map<Integer, Students> getStudents() {
        return students;
    }

    //toString
    @Override
    public String toString() {
        return students.toString();
    }



    // methods
    public List<Students> list() {
        return new ArrayList<>(students.values());
    }


    public void add(Students newStudent) {
        if (students.containsKey(newStudent.getId())) {
            throw new RuntimeException("Student with id: " + newStudent.getId() + " already exists.");
        }
        students.put(newStudent.getId(), newStudent);
    }

    public void add(List<Students> students) {
        for (Students student : students) {
            add(student); //calls add(Students) method above
        }
    }

    public void remove(int studentKey) throws StudentNotRemovedException {
        if (!students.containsKey(studentKey)) {
            throw new StudentNotRemovedException("Can not find key: " + studentKey);
        }
        students.remove(studentKey);
    }

    public Students randomStudent() {
        Random r = new Random();
        Object[] values = students.values().toArray();
        Students randomStudents = (Students) values[r.nextInt(values.length)];
        return randomStudents;
    }

    public Optional<Students> getById(int id){
        Students studentTOSearchFor = students.get(id);
        return Optional.ofNullable(studentTOSearchFor);
    }


}
