package unibe.edu.ec.matricula.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class CollegeCarrer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int semester;

    @OneToOne(cascade = CascadeType.ALL)
    private Teacher decade;

    @ManyToMany(mappedBy = "collegeCarrers")
    private List<Student> students;

    public CollegeCarrer(){

    }

    public CollegeCarrer(int id, String name, int semester, Teacher decade, List<Student> students) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.decade = decade;
        this.students = students;
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Teacher getDecade() {
        return decade;
    }

    public void setDecade(Teacher decade) {
        this.decade = decade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
