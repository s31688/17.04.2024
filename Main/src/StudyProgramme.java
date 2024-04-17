public record StudyProgramme(String name, String summary, int semester, int itn) {
    public String toString() {
        return this.name + " " + this.summary + " " + this.semester + " " + this.itn;
    }
}