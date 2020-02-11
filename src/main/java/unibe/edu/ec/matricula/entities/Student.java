package unibe.edu.ec.matricula.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Student extends Person {


    private boolean status;


    @JoinTable(
            name = "student_collegeCarrer",
            joinColumns = @JoinColumn(name="student",nullable = false),
            inverseJoinColumns = @JoinColumn(name="collegeCarrer", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CollegeCarrer> collegeCarrers;

    @ManyToMany(mappedBy = "students")
    private List<Parallel> parallels;

    public Student(){

    }

    public Student(String id, String name, String address, String phoneNumber, String email, String birthDate, boolean status, List<CollegeCarrer> collegeCarrers, List<Parallel> parallels) {
        super(id, name, address, phoneNumber, email, birthDate);
        this.status = status;
        this.collegeCarrers = collegeCarrers;
        this.parallels = parallels;
    }

    public List<CollegeCarrer> getCollegeCarrers() {
        return collegeCarrers;
    }

    public void setCollegeCarrers(List<CollegeCarrer> collegeCarrers) {
        this.collegeCarrers = collegeCarrers;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Parallel> getParallels() {
        return parallels;
    }

    public void setParallels(List<Parallel> parallels) {
        this.parallels = parallels;
    }




}
