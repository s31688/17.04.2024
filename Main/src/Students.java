import java.util.ArrayList;

public class Students {
    private static ArrayList<Student> students = new ArrayList<>();

    public Students() {
        students = Main.students;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Student> students) {
        Students.students = Main.students;
    }

    public static void promoteAllStudents() {
        for (Student student : students) {
            if (student.getStudyProgramme().getItn() < 5) {
                student.setSemester(student.getSemester() + 1);
            }
        }
    }

    public static void displayInfoAboutAllStudents() {
        setStudents(students);
        System.out.println(getStudents());
    }
}