import java.util.ArrayList;

public class Students {
    private static ArrayList<Student> students = new ArrayList<>();

    public Students() {

    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void setStudents() {
        Students.students = Student.getStudents();
    }

    public static void promoteAllStudents() {
        for (Student student : students) {
            if (student.getStudyProgramme().itn() < 5) {
                student.setSemester(student.getSemester() + 1);
            }
        }
    }

    public static void displayInfoAboutAllStudents() {
        setStudents();
        for (Student student : students) {
            System.out.println(student);
            System.out.println();
        }
    }
}