public class Main {
    public static void main(String[] args) {

        Person person = new Person("Ali", 30);
        Student student = new Student("Abobakr", 21, "202505010363");
        Lecturer lecturer = new Lecturer("Dr. Ahmad", 40, "Object Oriented Programming");

        person.introduce();
        System.out.println();

        student.introduce();
        System.out.println();

        lecturer.introduce();
    }
}