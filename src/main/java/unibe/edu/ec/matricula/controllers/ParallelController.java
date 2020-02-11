package unibe.edu.ec.matricula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import unibe.edu.ec.matricula.dtos.StudentDto;
import unibe.edu.ec.matricula.entities.Parallel;
import unibe.edu.ec.matricula.entities.Student;
import unibe.edu.ec.matricula.entities.Subject;
import unibe.edu.ec.matricula.repositories.ParallelRepository;
import unibe.edu.ec.matricula.repositories.SubjectRepository;

import java.util.Optional;
@Controller
public class ParallelController {
    @Autowired
    private ParallelRepository parallelRepository;

    public Optional<Parallel> readParallel(Subject subject) {
        Optional<Parallel> parallel = this.parallelRepository.findTopBySubject(subject);
        if (parallel.isPresent()) {
            return Optional.of(parallel.get());
        } else {
            return Optional.empty();
        }
    }
    public boolean putParallel(Student student, Parallel parallel) {
        parallel.getStudents().add(student);
        this.parallelRepository.save(parallel);
        return true;
    }

}
