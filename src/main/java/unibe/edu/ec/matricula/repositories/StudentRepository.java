package unibe.edu.ec.matricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unibe.edu.ec.matricula.entities.Student;

public interface StudentRepository extends JpaRepository<Student,String> {


}
