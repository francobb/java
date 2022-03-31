package student;

import com.example.demo.student.Student;
import com.example.demo.student.StudentController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StudentControllerTest {

    @Autowired
    StudentController controller;

    Student rizzle;

    @BeforeAll
    void setup(){
     rizzle = new Student(UUID.randomUUID(), "RIZZLE");
    }


    @Test
    public void testStudentControllerOnSuccess(){
        var expect = controller.getStudent(rizzle.getStudentId().toString());

//        assertEquals(expect.getStudentName(), rizzle.getStudentName());
    }
}
