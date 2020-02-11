package unibe.edu.ec.matricula.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Parallel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Subject subject;

    @JoinTable(
            name = "parallel_studen",
            joinColumns = @JoinColumn(name = "student",nullable = false),
            inverseJoinColumns = @JoinColumn(name="parallel",nullable = false)

    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Student> students;

    public Parallel(){

    }

    public Parallel(int id, String name, Subject subject, List<Student> students) {
        this.id = id;
        this.name = name;
        this.subject = subject;
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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
