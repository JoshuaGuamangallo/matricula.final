package unibe.edu.ec.matricula.resources;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import unibe.edu.ec.matricula.dtos.CollegeCarrerDto;
import unibe.edu.ec.matricula.dtos.ParallelDto;
import unibe.edu.ec.matricula.dtos.StudentDto;
import unibe.edu.ec.matricula.entities.Student;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:test.properties")
public class StudentResourceTest {

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Autowired
    private RestService restService;
    private StudentDto studentDto;

    @Before
    public void before(){
        List<CollegeCarrerDto> collegeCarrerDtos= new ArrayList<CollegeCarrerDto>();
        List<ParallelDto> parallelDtos= new ArrayList<ParallelDto>();
        this.studentDto= new StudentDto("1716203292","ee","Quito","3368945456"
                ,"adf@asfa.com","29/11/1990",true,collegeCarrerDtos,parallelDtos);
    }

    @Test
    public void createStudent() {
        restService.restBuilder().path(StudentResource.STUDENT).body(this.studentDto).post().build();
    }

    @Test
    public void readStudentAll() {
        String json= restService.restBuilder(new RestBuilder<String>()).clazz(String.class).path(StudentResource.STUDENT).get().build();
        System.out.println("----->"+json);
    }
}
