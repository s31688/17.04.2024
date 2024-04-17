import java.util.ArrayList;

public class StudyProgramme {
    private String name;
    private String summary;
    private int semester;
    private int itn;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public StudyProgramme(String name, String summary, int semester, int itn) {
        this.name = name;
        this.summary = summary;
        this.semester = semester;
        this.itn = itn;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public int getSemester() {
        return semester;
    }

    public int getItn() {
        return itn;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setItn(int itn) {
        this.itn = itn;
    }
}