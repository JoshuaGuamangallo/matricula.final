package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.Subject;

public class SubjectDto {

    private int id;

    private String name;

    private int credits,semester;
    private CollegeCarrerDto collegeCarrerDto;
    public SubjectDto(){

    }

    public SubjectDto(int id, String name, int credits, int semester, CollegeCarrerDto collegeCarrerDto) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.semester = semester;
        this.collegeCarrerDto = collegeCarrerDto;
    }

    public SubjectDto(Subject subject){
        this.id=subject.getId();
        this.name=subject.getName();
        this.credits=subject.getCredits();
        this.semester=subject.getSemester();
        this.collegeCarrerDto=new CollegeCarrerDto(subject.getCollegeCarrer());

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

    public CollegeCarrerDto getCollegeCarrerDto() {
        return collegeCarrerDto;
    }

    public void setCollegeCarrerDto(CollegeCarrerDto collegeCarrerDto) {
        this.collegeCarrerDto = collegeCarrerDto;
    }

    @Override
    public String toString() {
        return "SubjectDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", semester=" + semester +
                ", collegeCarrerDto=" + collegeCarrerDto +
                '}';
    }
}
