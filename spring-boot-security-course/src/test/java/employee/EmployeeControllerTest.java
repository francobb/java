package employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import com.example.demo.employee.EmployeeController;
import com.example.demo.employee.EmployeeEntity;
import com.example.demo.employee.EmployeeRepository;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {EmployeeEntity.class, EmployeeRepository.class, EmployeeEntity.class})
@RunWith(MockitoJUnitRunner.class)
class EmployeeControllerTest {
    @InjectMocks
    private EmployeeController employeeController;

    @Mock
    private EmployeeRepository employeeRepository;

    private EmployeeEntity employeeEntity = new EmployeeEntity();

    @Test
    public void getAll() {
        when(employeeRepository.findAll()).thenReturn(Collections.singletonList(employeeEntity));

        List<EmployeeEntity> returnList = employeeController.getAll();
        assertNotNull(returnList);
        assertEquals(1, returnList.size());
    }

    // TODO: Write a test to add an employee to the database and returns it
}