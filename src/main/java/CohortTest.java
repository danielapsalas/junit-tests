import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;
import java.util.ArrayList;

import static org.junit.Assert.*;
public class CohortTest {
    Cohort azeban = new Cohort();
    Student milo = new Student(123, "milo");

    @Before
    public void setUp(){
        azeban.addStudent(milo);
        milo.addGrade(90);
        milo.addGrade(85);
        milo.addGrade(70);
    }
    @Test
    public void listTest(){
        assertNotNull(azeban);
    }
    @Test
    public void currentList(){
        assertNotNull(azeban.getStudents());
    }

    @Test
    public void testAverageGrade(){
        assertEquals(81, azeban.getCohortAverage(), 1);
    }
}
