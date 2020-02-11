package unibe.edu.ec.matricula.resources.exeptions;

public class StudentAllReadyExist extends Exception {

    private static final long serialVersionUID = -7717691994704695707L;

    public static final String DESCRIPTION = "El estudiante ya existe";

    public StudentAllReadyExist() {
        super(DESCRIPTION);
    }

    public StudentAllReadyExist(String message) {
        super(DESCRIPTION+" "+message);
    }
}
