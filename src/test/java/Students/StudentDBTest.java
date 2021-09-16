package Students;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {


    @Test

    void list() {
        //given

        StudentDB testDB = new StudentDB(List.of(
        new MathStudent("Peter", 1),
        new MathStudent("Peter", 2)
        ));
        List<Students> expected = new ArrayList<>(List.of(
                new MathStudent("Peter", 1),
                new MathStudent("Peter", 2)
        ));
        //when
        List<Students> actual = testDB.list();
        //then
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("throws exeption when students already exists")
    void add() {
        //given
        StudentDB testDB = new StudentDB();
        testDB.add(new MathStudent("Peter", 1));
        testDB.add(new MathStudent("Peter", 2));
        testDB.add(new MathStudent("Maria", 3));
        String expected = "Student with id: 3 already exists.";
        //when
        try {
            testDB.add(new MathStudent("Maria", 3));
            fail();  // usually the program can not reach this part of the code. fail() will force the test to crash if it does
        }
        catch (RuntimeException e){
            String actual = e.getMessage();
            //then
            assertEquals(expected,actual);
        }
    }
}