package unibe.edu.ec.matricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unibe.edu.ec.matricula.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,String> {
}
