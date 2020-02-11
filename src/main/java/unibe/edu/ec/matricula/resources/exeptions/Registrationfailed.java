package unibe.edu.ec.matricula.resources.exeptions;

import java.text.ParseException;

public class Registrationfailed extends Exception {
    private static final long serialVersionUID = -7717691994704695707L;


    
    public static final String DESCRIPTION = "Fallo de inscripcion";

    public Registrationfailed() {
        super(DESCRIPTION);
    }

    public Registrationfailed(String message) {
        super(DESCRIPTION+" "+message);
    }
}
