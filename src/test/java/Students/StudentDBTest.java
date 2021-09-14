//package Students;
//import org.junit.jupiter.api.Test;
//import java.util.Arrays;
//import static org.junit.jupiter.api.Assertions.*;
//
//class StudentDBTest {
//
//    Student[] testStudents = {
//            new Student("Hans", 01),
//            new Student("Peter", 02),
//    };
//    StudentDB testDB = new StudentDB(testStudents);
//
//    @Test
//    void list() {
//        //given
//        String expected = "[[name='Hans'; id=1], [name='Peter'; id=2]]";
//        //when
//        String actual = testDB.list();
//        //then
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void remove() {
//        //given
//             //testDB
//        //when
//        boolean actual = testDB.remove(1); //should remove "Hans" from the list
//        //then
//        assertTrue(actual);
//    }
//}