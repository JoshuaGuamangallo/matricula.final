package unibe.edu.ec.matricula.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import unibe.edu.ec.matricula.controllers.StudentController;
import unibe.edu.ec.matricula.dtos.StudentDto;
import unibe.edu.ec.matricula.entities.Parallel;
import unibe.edu.ec.matricula.resources.exeptions.DateFormatInvalidad;
import unibe.edu.ec.matricula.resources.exeptions.StudentAllReadyExist;
import unibe.edu.ec.matricula.resources.exeptions.StudentIdNotFoundException;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(StudentResource.STUDENT)
public class StudentResource {

    public static final String STUDENT = "/students";

    public static final String ID="/{id}";

    @Autowired
    private StudentController studentController;

    @PostMapping
    public void createStudent(@Valid @RequestBody StudentDto studentDto) throws StudentAllReadyExist, DateFormatInvalidad {
        try {
            this.studentController.crateStudent(studentDto);
        } catch (ParseException e) {
            throw new DateFormatInvalidad("",1);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<StudentDto> readStudentAll() {
        return this.studentController.readStudentAll();
    }

    @RequestMapping(value = ID, method = RequestMethod.GET)
    public StudentDto readStudent(@PathVariable String id) throws StudentIdNotFoundException {
        return this.studentController.readStudent(id).orElseThrow(()-> new StudentIdNotFoundException(id));
    }

    @PutMapping(value = ID)
    public void putStudent(@PathVariable String id, @Valid @RequestBody StudentDto studentDto) throws  StudentIdNotFoundException{
        if(!this.studentController.putStudent(id,studentDto)){
            throw new StudentIdNotFoundException();
        }
    }

}
