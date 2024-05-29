import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12",
                "333-322-222", LocalDate.of(1980, 4, 14), 4);
        Student s2 = new Student("Adam", "Doe", "doe@wp.pl", "Warsaw, Zlota 12",
                "333-322-222", LocalDate.of(1980, 1, 1), 0);
        StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);
        s.enrollStudent(it);
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");
        s2.enrollStudent(it);
        s2.addGrade(5, "PGO");
        s2.addGrade(2, "APBD");
        Student.promoteAllStudents();
        s.displayInfoAboutAllStudents();
    }
}