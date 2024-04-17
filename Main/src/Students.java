import java.util.ArrayList;

public class Students {
    private static ArrayList<Student> students = new ArrayList<>();

    public Students() {

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public static void promoteAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudyProgramme().getItn() < 5) {
                students.get(i).setSemester(students.get(i).getSemester() + 1);
            }
        }
    }

    public static void displayInfoAboutAllStudents() {

    }
}