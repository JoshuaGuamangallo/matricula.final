package unibe.edu.ec.matricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unibe.edu.ec.matricula.entities.Prerequirement;
import unibe.edu.ec.matricula.entities.Subject;

import java.util.List;

public interface PrerequirementRepository extends JpaRepository<Prerequirement,Integer> {

}
