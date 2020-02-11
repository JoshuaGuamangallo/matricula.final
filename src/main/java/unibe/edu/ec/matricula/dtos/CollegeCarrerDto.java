package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.CollegeCarrer;
import unibe.edu.ec.matricula.entities.Student;

import java.util.List;

public class CollegeCarrerDto {

    private int id;

    private String name;

    private int semester;

    private TeacherDto decade;

    private List<StudentDto> studentDtos;

    public CollegeCarrerDto() {
    }

    public CollegeCarrerDto(int id, String name, int semester, TeacherDto decade, List<StudentDto> studentDtos) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.decade = decade;
        this.studentDtos = studentDtos;
    }

    public CollegeCarrerDto(CollegeCarrer collegeCarrer){

        this.id=collegeCarrer.getId();
        this.name=collegeCarrer.getName();
        this.semester=collegeCarrer.getSemester();
        this.decade=new TeacherDto(collegeCarrer.getDecade());
        for (Student student:
             collegeCarrer.getStudents()) {
            StudentDto studentDto=new StudentDto(student);
            this.studentDtos.add(studentDto);

        }
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

    public TeacherDto getDecade() {
        return decade;
    }

    public void setDecade(TeacherDto decade) {
        this.decade = decade;
    }

    public List<StudentDto> getStudentDtos() {
        return studentDtos;
    }

    public void setStudentDtos(List<StudentDto> studentDtos) {
        this.studentDtos = studentDtos;
    }

    @Override
    public String toString() {
        return "CollegeCarrerDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", semester=" + semester +
                ", decade=" + decade +
                ", studentDtos=" + studentDtos +
                '}';
    }
}
