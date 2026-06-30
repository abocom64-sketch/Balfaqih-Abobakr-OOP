public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("CU12345", "Ali", 3.75, "BIT");

        System.out.println("Student ID : " + student1.getStudentID());
        System.out.println("Name       : " + student1.getName());
        System.out.println("CGPA       : " + student1.getCGPA());
        System.out.println("Programme  : " + student1.getProgramme());
    }
}