public class Student {

    private String studentID;
    private String name;
    private double cgpa;
    private String programme;

    public Student(String studentID, String name, double cgpa, String programme) {
        this.studentID = studentID;
        this.name = name;
        this.cgpa = cgpa;
        this.programme = programme;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getProgramme() {
        return programme;
    }
}