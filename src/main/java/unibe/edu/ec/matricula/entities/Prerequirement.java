package unibe.edu.ec.matricula.entities;

import javax.persistence.*;

@Entity
public class Prerequirement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Subject subject;


    @ManyToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Subject prerequirement;

    public Prerequirement(){}

    public Prerequirement(int id, Subject subject, Subject prerequirement) {
        this.id = id;
        this.subject = subject;
        this.prerequirement = prerequirement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getPrerequirement() {
        return prerequirement;
    }

    public void setPrerequirement(Subject prerequirement) {
        this.prerequirement = prerequirement;
    }
}
