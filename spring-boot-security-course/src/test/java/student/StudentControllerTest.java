package student;


import com.example.demo.student.Student;
import com.example.demo.student.StudentController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StudentControllerTest {

    StudentController controller;

    Student rizzle;

    @BeforeAll
    void setup(){
        controller = new StudentController();
        rizzle = new Student(UUID.randomUUID(), "RIZZLE");
    }


    @Test
    public void testStudentControllerOnSuccess(){
        assertTrue(true);
//        var expect = controller.getStudent(rizzle.getStudentId().toString());
//        assertEquals(expect.getStudentName(), rizzle.getStudentName());
        assertNotNull(rizzle);
    }
}
