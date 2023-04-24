import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort azeban;
    Student milo = new Student(123, "milo");

    @Before
    public void setUp(){
        this.azeban = new Cohort();
        azeban.addStudent(milo);
        milo.addGrade(90);
        milo.addGrade(85);
        milo.addGrade(70);
    }
    @Test
    public void listTest(){
        assertNotNull(azeban);
        Student bryan = new Student(324, "bryan");
        this.azeban.addStudent(bryan);
        assertEquals(2, azeban.getStudents().size());
    }
    @Test
    public void currentList(){
        assertNotNull(azeban.getStudents());
        assertEquals("milo", azeban.getStudents().get(0).getName());
    }

    @Test
    public void testAverageGrade(){
        assertEquals(81, azeban.getCohortAverage(), 1);
    }
}
