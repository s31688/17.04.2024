import java.util.Date;
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
    private final HashMap<String, Integer> grades = new HashMap<>();
    private static final ArrayList<Student> students = new ArrayList<>();

    public Student(String name, String surname, String email, String address, String phoneNumber, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.indexNumber = "s" + (Main.counter == 7 ? Main.counter : ++Main.counter);
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

    public HashMap<String, Integer> getGrades() {
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
        this.semester = (studyProgramme.semester() == 7 ? studyProgramme.semester() : studyProgramme.semester() + 1);
        this.status = this.semester == 1 ? "Candidate" : (this.semester == 7 ? "Graduate" : "Student");
        setStudyProgrammes(studyProgramme);
    }

    public void addGrade(int grade, String subject) {
        this.grades.put(subject, grade);
    }

    @Deprecated
    public String toString() {
         return "Student " + this.getIndexNumber()
                 + "\nname: " + this.getName() + " " + this.getSurname()
                 + "\nemail: " + this.getEmail()
                + "\naddress: " + this.getAddress()
                 + "\nphone number:" + this.getPhoneNumber()
                 + "\ndate of birth: " + this.getDateOfBirth().getYear() + "." + this.getDateOfBirth().getMonth() +
                 "." + this.getDateOfBirth().getDate()
                 + "\nstudy programme: " + this.getStudyProgramme()
                 + "\nstatus: " + this.getStatus()
                 + "\nsemester: " + this.getSemester()
                 + "\ngrades: " + this.getGrades();
    }
}