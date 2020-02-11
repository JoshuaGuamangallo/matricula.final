package unibe.edu.ec.matricula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import unibe.edu.ec.matricula.dtos.StudentDto;
import unibe.edu.ec.matricula.dtos.SubjectDto;
import unibe.edu.ec.matricula.entities.*;
import unibe.edu.ec.matricula.repositories.AcademicRecordRepository;
import java.util.Optional;
@Controller
public class AcademicRecordController {
@Autowired
private AcademicRecordRepository academicRecordRepository;


    public Optional<AcademicRecord> readAcademicRecord(Student student, Subject subject) {

        Optional<AcademicRecord> academicRecord = this.academicRecordRepository.findTopByStudentAndSubject(student,subject);
        if (academicRecord.isPresent()) {
            return Optional.of(academicRecord.get());
        } else {
            return Optional.empty();
        }
    }
}
