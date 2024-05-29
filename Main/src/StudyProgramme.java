public class StudyProgramme {
    private String name;
    private String summary;
    private int semester;
    private int itn;

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

    public String toString() {
        return this.name + " " + this.summary + " " + this.semester + " " + this.itn;
    }
}