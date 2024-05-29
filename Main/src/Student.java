import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private static int counter = 0;
    private String name;
    private String surname;
    private String email;
    private String address;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String indexNumber;
    private StudyProgramme studyProgramme;
    private String status;
    private int semester;
    private int ITN;
    private HashMap<String, Integer> grades = new HashMap<>();
    private static ArrayList<Student> students = new ArrayList<>();

    public Student(String name, String surname, String email, String address, String phoneNumber, LocalDate dateOfBirth, int ITN) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.ITN = ITN;
        this.indexNumber = "s" + (counter == 7 ? counter : ++counter);
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

    public LocalDate getDateOfBirth() {
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

    public int getITN() {
        return ITN;
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
        this.semester = (studyProgramme.getSemester() == 7 ? studyProgramme.getSemester() : studyProgramme.getSemester() + 1);
        this.status = this.semester == 1 ? "Candidate" : (this.semester == 7 ? "Graduate" : "Student");
        setStudyProgrammes(studyProgramme);
    }

    public void addGrade(int grade, String subject) {
        this.grades.put(subject, grade);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : students) {
            if(student.getSemester() < student.getStudyProgramme().getSemester() && student.getITN() <= student.getStudyProgramme().getItn()) {
                student.semester++;
                student.status = "Student";
            } else if (student.getSemester() == student.getStudyProgramme().getSemester()) {
                student.status = "Graduate";
            } else {
                student.status = "Failed, so has ITN";
            }
        }
    }

    public String toString() {
        return "Student " + this.getIndexNumber()
                + "\nname: " + this.getName() + " " + this.getSurname()
                + "\nemail: " + this.getEmail()
                + "\naddress: " + this.getAddress()
                + "\nphone number:" + this.getPhoneNumber()
                + "\ndate of birth: " + this.getDateOfBirth().getYear() + "." + this.getDateOfBirth().getMonth()
                + "." + this.getDateOfBirth() + "\nstudy programme: " + this.getStudyProgramme()
                + "\nstatus: " + this.getStatus()
                + "\nsemester: " + this.getSemester()
                + "\ngrades: " + this.getGrades();
    }

    public void displayInfoAboutAllStudents() {
        for(Student student : students) {
            System.out.println(student);
        }
    }
}