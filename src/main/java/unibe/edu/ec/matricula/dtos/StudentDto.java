package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.CollegeCarrer;
import unibe.edu.ec.matricula.entities.Parallel;
import unibe.edu.ec.matricula.entities.Student;

import java.util.List;

public class StudentDto {

    private String id;

    private String name, address, phoneNumber, email;

    private String birthDate;

    private boolean status;

    private List<CollegeCarrerDto> collegeCarrerDtos;

    private List<ParallelDto> parallelDtos;

    public StudentDto() {

    }

    public StudentDto(String id, String name, String address, String phoneNumber, String email, String birthDate, boolean status, List<CollegeCarrerDto> collegeCarrerDtos, List<ParallelDto> parallelDtos) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
        this.status = status;
        this.collegeCarrerDtos = collegeCarrerDtos;
        this.parallelDtos = parallelDtos;
    }

    public StudentDto(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.address = student.getAddress();
        this.phoneNumber = student.getPhoneNumber();
        this.email = student.getEmail();
        this.status = student.isStatus();
        this.birthDate = student.getBirthDate();
        for (CollegeCarrer collegeCarrer : student.getCollegeCarrers()) {
            CollegeCarrerDto collegeCarrerDto = new CollegeCarrerDto(collegeCarrer);
            this.collegeCarrerDtos.add(collegeCarrerDto);
        }

        for (Parallel parallel :
                student.getParallels()) {
            ParallelDto parallelDto = new ParallelDto(parallel);
            this.parallelDtos.add(parallelDto);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<CollegeCarrerDto> getCollegeCarrerDtos() {
        return collegeCarrerDtos;
    }

    public void setCollegeCarrerDtos(List<CollegeCarrerDto> collegeCarrerDtos) {
        this.collegeCarrerDtos = collegeCarrerDtos;
    }

    public List<ParallelDto> getParallelDtos() {
        return parallelDtos;
    }

    public void setParallelDtos(List<ParallelDto> parallelDtos) {
        this.parallelDtos = parallelDtos;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", status=" + status +
                ", collegeCarrerDtos=" + collegeCarrerDtos +
                ", parallelDtos=" + parallelDtos +
                '}';
    }
}
