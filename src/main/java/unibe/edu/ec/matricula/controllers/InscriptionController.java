package unibe.edu.ec.matricula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import unibe.edu.ec.matricula.dtos.InscriptionDto;
import unibe.edu.ec.matricula.dtos.StudentDto;
import unibe.edu.ec.matricula.entities.AcademicRecord;
import unibe.edu.ec.matricula.entities.Parallel;
import unibe.edu.ec.matricula.entities.Student;
import unibe.edu.ec.matricula.entities.Subject;
import unibe.edu.ec.matricula.repositories.AcademicRecordRepository;

import java.util.Optional;

@Controller
public class InscriptionController {

    @Autowired
    private SubjectController subjectController;
    @Autowired
    private ParallelController parallelController;
    @Autowired
    private AcademicRecordController academicRecordController;
    @Autowired
    private StudentController studentController;


    public boolean generateInscription(InscriptionDto inscriptionDto) {
        Optional<Student> student = this.studentController.readStudentById(inscriptionDto.getStudentDto().getId());
        Optional<Subject> subject = this.subjectController.readSubject("Aplicaciones Web");
        if (!subject.isPresent()) return false;
        Optional<Subject> subject2 = this.subjectController.readSubject("Practicas preprofesionales");
        if (!subject2.isPresent()) return false;
        Optional<AcademicRecord> academicRecord = this.academicRecordController.readAcademicRecord(student.get(), subject.get());
        if (!academicRecord.isPresent()) return false;
        if (academicRecord.get().getNote() < 7) {
            return false;
        }
        Optional<Parallel> parallel = this.parallelController.readParallel(subject2.get());
        assert parallel != null;
        this.parallelController.putParallel(student.get(), parallel.get());


        return true;

    }
}
