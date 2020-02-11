package unibe.edu.ec.matricula.entities;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int credits,semester;

    @ManyToOne(optional = false, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private CollegeCarrer collegeCarrer;

    public Subject(){}


    public Subject(int id, String name, int credits, int semester, CollegeCarrer collegeCarrer) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.semester = semester;
        this.collegeCarrer = collegeCarrer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public CollegeCarrer getCollegeCarrer() {
        return collegeCarrer;
    }

    public void setCollegeCarrer(CollegeCarrer collegeCarrer) {
        this.collegeCarrer = collegeCarrer;
    }
}
