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
import unibe.edu.ec.matricula.dtos.*;
import unibe.edu.ec.matricula.entities.Subject;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:test.properties")
public class InscriptionResourceTest {

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Autowired
    private RestService restService;
    private InscriptionDto inscriptionDto;

    @Before
    public void before(){
        StudentDto studentDto= new StudentDto();
        studentDto.setId("1");
        SubjectDto subjectDto= new SubjectDto();
        subjectDto.setId(1);
        this.inscriptionDto = new InscriptionDto(studentDto, subjectDto);
    }

    @Test
    public void generateInscriptionTest() {
        restService.restBuilder().path(InscriptionResource.INSCRIPTION).body(this.inscriptionDto).post().build();
    }


}
