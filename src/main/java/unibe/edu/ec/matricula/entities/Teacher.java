package unibe.edu.ec.matricula.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Teacher extends  Person{



    private String degreeType;


    public Teacher(){

    }

    public Teacher(String id, String name, String address, String phoneNumber, String email, String birthDate, String degreeType) {
        super(id, name, address, phoneNumber, email, birthDate);
        this.degreeType = degreeType;
    }

    public String getDegreeType() {
        return degreeType;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "degreeType='" + degreeType + '\'' +
                '}';
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }
}
