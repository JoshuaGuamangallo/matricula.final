package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.AcademicRecord;

public class AcademicRecordDto {

    private int id;

    private double note;

    private StudentDto studentDto;

    private SubjectDto subjectDto;

    public AcademicRecordDto(){}

    public AcademicRecordDto(int id, double note, StudentDto studentDto, SubjectDto subjectDto) {
        this.id = id;
        this.note = note;
        this.studentDto = studentDto;
        this.subjectDto = subjectDto;
    }

    public AcademicRecordDto(AcademicRecord academicRecord){
        this.id=academicRecord.getId();
        this.note= academicRecord.getNote();
        this.studentDto= new StudentDto(academicRecord.getStudent());
        this.subjectDto=new SubjectDto(academicRecord.getSubject());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
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

    @Override
    public String toString() {
        return "AcademicRecordDto{" +
                "id=" + id +
                ", note=" + note +
                ", studentDto=" + studentDto +
                ", subjectDto=" + subjectDto +
                '}';
    }
}
