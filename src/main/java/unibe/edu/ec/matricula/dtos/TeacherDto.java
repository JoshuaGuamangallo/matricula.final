package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.Teacher;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TeacherDto {

    private String id;

    private String name,address, phoneNumber,email,degreeType;

    private String birthDate;

    public TeacherDto(){

    }

    public TeacherDto(String id, String name, String address, String phoneNumber, String email, String degreeType, String birthDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.degreeType = degreeType;
        this.birthDate = birthDate;
    }

    public TeacherDto(Teacher teacher){
        this.id= teacher.getId();
        this.name=teacher.getName();
        this.address=teacher.getAddress();
        this.phoneNumber=teacher.getPhoneNumber();
        this.email=teacher.getEmail();
        this.degreeType=teacher.getDegreeType();
        this.birthDate=teacher.getBirthDate();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "TeacherDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", degreeType='" + degreeType + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
