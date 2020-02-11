package unibe.edu.ec.matricula.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unibe.edu.ec.matricula.controllers.InscriptionController;
import unibe.edu.ec.matricula.controllers.StudentController;
import unibe.edu.ec.matricula.dtos.InscriptionDto;
import unibe.edu.ec.matricula.dtos.StudentDto;
import unibe.edu.ec.matricula.entities.Parallel;
import unibe.edu.ec.matricula.resources.exeptions.DateFormatInvalidad;
import unibe.edu.ec.matricula.resources.exeptions.Registrationfailed;
import unibe.edu.ec.matricula.resources.exeptions.StudentAllReadyExist;
import unibe.edu.ec.matricula.resources.exeptions.StudentIdNotFoundException;

import javax.validation.Valid;
import java.text.ParseException;

@RestController
@RequestMapping(InscriptionResource.INSCRIPTION)
public class InscriptionResource {
    public static final String INSCRIPTION = "/inscription";

    @Autowired
    private InscriptionController inscriptionController;

   @PostMapping
    public void generateInscription(@Valid @RequestBody InscriptionDto inscriptionDto) throws Registrationfailed {
       if(!this.inscriptionController.generateInscription(inscriptionDto)){
           throw  new Registrationfailed();
       }
   }
}
