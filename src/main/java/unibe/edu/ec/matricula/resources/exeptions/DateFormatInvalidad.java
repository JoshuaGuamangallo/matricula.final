package unibe.edu.ec.matricula.resources.exeptions;

import java.text.ParseException;

public class DateFormatInvalidad extends ParseException {

    private static final long serialVersionUID = -7717121994704695707L;
    public static final String DESCRIPTION = "El formato de la fecha es incorrecto tiene que ser dd/mm/aaaa";

    public DateFormatInvalidad(String s, int errorOffset) {
        super(DESCRIPTION, errorOffset);
    }
}
