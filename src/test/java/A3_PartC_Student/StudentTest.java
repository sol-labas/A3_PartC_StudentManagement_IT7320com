package A3_PartC_Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StudentTest
{
    Student student = new Student();
    String expected, name, actual;

    @Before
    public void setUp() throws Exception {
        name = "Kuznetsova Angela";
        actual = student.displayStudentName("Kuznetsova", "Angela");
        expected = name;
    }

    @Test

    public void testDisplayStudentName() {

        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {

    }
}
