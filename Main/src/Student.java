import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private String surname;
    private String email;
    private String address;
    private String phoneNumber;
    private Date dateOfBirth;
    private String indexNumber;
    private StudyProgramme studyProgramme;
    private String status;
    private int semester;
    private HashMap<Integer, String> grades = new HashMap<>();

    public Student(String name, String surname, String email, String address, String phoneNumber, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.indexNumber = "s" + ++Main.counter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public String getStatus() {
        return status;
    }

    public int getSemester() {
        return semester;
    }

    public HashMap<Integer, String> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setStudyProgrammes(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setGrades(HashMap<Integer, String> grades) {
        this.grades = grades;
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.semester = studyProgramme.getSemester() + 1;
        this.status = this.semester == 1 ? "Candidate" : (this.semester == 7 ? "Graduate" : "Student");
    }

    public void addGrade(int grade, String subject) {
        this.grades.put(grade, subject);
    }
}