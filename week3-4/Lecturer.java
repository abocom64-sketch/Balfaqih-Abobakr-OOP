public class Lecturer extends Person {
    String subject;

    public Lecturer(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am lecturer " + name + ".");
        System.out.println("I teach " + subject + ".");
    }
}