import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private final String name;
    private final String surname;
    private final String email;
    private final String address;
    private final String phoneNumber;
    private final Date dateOfBirth;
    private final String indexNumber;
    private StudyProgramme studyProgramme;
    private String status;
    private int semester;
    private final HashMap<Integer, String> grades = new HashMap<>();
    private static final ArrayList<Student> students = new ArrayList<>();

    public Student(String name, String surname, String email, String address, String phoneNumber, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.indexNumber = "s" + ++Main.counter;
        students.add(this);
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

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudyProgrammes(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.semester = studyProgramme.semester() + 1;
        this.status = this.semester == 1 ? "Candidate" : (this.semester == 7 ? "Graduate" : "Student");
        setStudyProgrammes(studyProgramme);
    }

    public void addGrade(int grade, String subject) {
        this.grades.put(grade, subject);
    }

    public String toString() {
        return "\nStudent " + this.getSemester() + " " + this.getName() + " " + this.getSurname() + " " + this.getEmail()
                + " " + this.getAddress() + " " + this.getPhoneNumber() + " " + this.getDateOfBirth() + " "
                + this.getIndexNumber() + " " + this.getStudyProgramme().name() + " "
                + this.getStudyProgramme().summary() + " " + this.getStudyProgramme().semester() + " "
                + this.getStudyProgramme().itn() + " " + this.getStatus() + " " + this.getSemester() + " "
                + this.getGrades() + "\n";
    }
}