package Students;
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
        Map<Integer, Students> expected = new HashMap<Integer, Students>();
        expected.put(1, new MathStudent("Peter", 2));
        expected.put(2, new MathStudent("Maria", 5));
        expected.put(3, new MathStudent("Hans", 9));


        StudentDB testDB = new StudentDB(expected);

        //when
        Map<Integer, Students> actual = testDB.getStudents();
        //then
        assertEquals(expected, actual);
    }

}