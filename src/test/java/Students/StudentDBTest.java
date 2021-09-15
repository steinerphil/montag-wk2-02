package Students;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;




class StudentDBTest {





    @Test

    void list() {
        //given
        List<Student> expected = new ArrayList<>();

        expected.add(new MathStudent("Peter", 2));
        expected.add(new MathStudent("Maria", 5));
        expected.add(new MathStudent("Hans", 9));

        StudentDB testDB = new StudentDB(expected);

        //when
        List actual = testDB.getStudents();
        //then
        assertEquals(expected, actual);
    }

}