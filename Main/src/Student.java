import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private String email;
    private String address;
    private String phoneNumber;
    private Date dateOfBirth;
    private String indexNumber;
    private ArrayList<StudyProgramme> studyProgrammes = new ArrayList<>();

    public Student(String name, String surname, String email, String address, String phoneNumber, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.indexNumber = "s" + (int)(Math.random()*100);
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

    public ArrayList<StudyProgramme> getStudyProgrammes() {
        return studyProgrammes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setStudyProgrammes(ArrayList<StudyProgramme> studyProgrammes) {
        this.studyProgrammes = studyProgrammes;
    }
}