import java.util.ArrayList;

public class Main {
    public static int counter = 0;
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Student s = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12",
                "333-322-222", new Date(1980, 1, 1));
        Student s2 = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12",
                "333-322-222", new Date(1980, 1, 1));
        StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);
        s.enrollStudent(it);
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");
        students.add(s);
        s2.enrollStudent(it);
        s2.addGrade(5, "PGO");
        s2.addGrade(2, "APBD");
        students.add(s2);
        Students.promoteAllStudents();
        Students.displayInfoAboutAllStudents();
        //System.out.println(s);
    }
}