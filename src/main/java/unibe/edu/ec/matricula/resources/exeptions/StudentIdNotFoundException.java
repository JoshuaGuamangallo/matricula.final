package unibe.edu.ec.matricula.resources.exeptions;

public class StudentIdNotFoundException extends Exception {
    private static final long serialVersionUID = -7717691994704695707L;

    public static final String DESCRIPTION = "la cedula del estudiante no fue encontrada";

    public StudentIdNotFoundException() {
        super(DESCRIPTION);
    }

    public StudentIdNotFoundException(String message) {
        super(DESCRIPTION+" "+message);
    }
}
