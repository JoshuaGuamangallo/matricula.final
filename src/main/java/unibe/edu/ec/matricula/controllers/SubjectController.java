package unibe.edu.ec.matricula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import unibe.edu.ec.matricula.dtos.StudentDto;
import unibe.edu.ec.matricula.dtos.SubjectDto;
import unibe.edu.ec.matricula.entities.CollegeCarrer;
import unibe.edu.ec.matricula.entities.Parallel;
import unibe.edu.ec.matricula.entities.Student;
import unibe.edu.ec.matricula.entities.Subject;
import java.text.ParseException;
import java.util.ArrayList;
import unibe.edu.ec.matricula.repositories.SubjectRepository;
import java.util.List;
import java.util.Optional;

@Controller
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;

    public Optional<Subject> readSubject(String name) {
        Optional<Subject> subject = this.subjectRepository.findTopByName(name);
        if (subject.isPresent()) {
            return Optional.of(subject.get());
        } else {
            return Optional.empty();
        }
    }
}
