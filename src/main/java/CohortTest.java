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
    }
    @Test
    public void listTest(){
        assertNotNull(azeban.getStudents());
    }
    @Test
    public void
}
