package Students;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {


    @Test

    void list() {
        //given
        Map<Integer, Students> expected = new HashMap<Integer, Students>();
        expected.put(1, new MathStudent("Peter", 1));
        expected.put(2, new MathStudent("Maria", 2));
        expected.put(3, new MathStudent("Hans", 3));

        StudentDB testDB = new StudentDB(expected);

        //when
        Map<Integer, Students> actual = testDB.getStudents();
        //then
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("throws exeption when students already exists")
    void add() {
        //given
        Map<Integer, Students> testStudents = new HashMap<Integer, Students>();
        testStudents.put(1, new MathStudent("Peter", 1));
        testStudents.put(2, new MathStudent("Maria", 2));
        StudentDB testDB = new StudentDB(testStudents);
        String expected = "Student Maria already exists.";
        //when
        try {
            testDB.add(new MathStudent("Maria", 2));
            fail();  // usually the program can not reach this part of the code. fail() will force the test to crash if it does
        }
        catch (RuntimeException e){
            String actual = e.getMessage();
            //then
            assertEquals(expected,actual);
        }
    }
}