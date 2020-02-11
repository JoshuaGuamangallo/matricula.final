package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.Parallel;
import unibe.edu.ec.matricula.entities.Student;

import java.util.List;

public class ParallelDto {
    private int id;

    private String name;

    private SubjectDto subjectDto;

    private List<StudentDto> studentDtos;

    public ParallelDto() {

    }

    public ParallelDto(int id, String name, SubjectDto subjectDto, List<StudentDto> studentDtos) {
        this.id = id;
        this.name = name;
        this.subjectDto = subjectDto;
        this.studentDtos = studentDtos;
    }

    public ParallelDto(Parallel parallel) {
        this.id = parallel.getId();
        this.name = parallel.getName();
        this.subjectDto = new SubjectDto(parallel.getSubject());
        for (Student student :
                parallel.getStudents()) {
            StudentDto studentDto = new StudentDto(student);
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

    public SubjectDto getSubjectDto() {
        return subjectDto;
    }

    public void setSubjectDto(SubjectDto subjectDto) {
        this.subjectDto = subjectDto;
    }

    public List<StudentDto> getStudentDtos() {
        return studentDtos;
    }

    public void setStudentDtos(List<StudentDto> studentDtos) {
        this.studentDtos = studentDtos;
    }

    @Override
    public String toString() {
        return "ParallelDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjectDto=" + subjectDto +
                ", studentDtos=" + studentDtos +
                '}';
    }
}
