public class Student extends Person {
    String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am student " + name + ".");
        System.out.println("Student ID: " + studentId);
    }
}