package unibe.edu.ec.matricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unibe.edu.ec.matricula.entities.AcademicRecord;
import unibe.edu.ec.matricula.entities.Student;
import unibe.edu.ec.matricula.entities.Subject;

import java.util.Optional;

public interface AcademicRecordRepository extends JpaRepository<AcademicRecord,Integer> {
    public Optional<AcademicRecord> findTopByStudentAndSubject(Student student, Subject subject);

}
