package unibe.edu.ec.matricula.dtos;

public class InscriptionDto {
    private StudentDto studentDto;
    private SubjectDto subjectDto;

    public InscriptionDto(){

    }
    public InscriptionDto(StudentDto studentDto, SubjectDto subjectDto) {
        this.studentDto = studentDto;
        this.subjectDto = subjectDto;
    }


    public StudentDto getStudentDto() {
        return studentDto;
    }

    public void setStudentDto(StudentDto studentDto) {
        this.studentDto = studentDto;
    }

    public SubjectDto getSubjectDto() {
        return subjectDto;
    }

    public void setSubjectDto(SubjectDto subjectDto) {
        this.subjectDto = subjectDto;
    }
}
