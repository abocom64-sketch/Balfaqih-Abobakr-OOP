import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student ID: ");
            int studentID = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter CourseName: ");
            String coursename = sc.nextLine();


            System.out.print("Enter Marks computer programming: ");
            double Subject1 = sc.nextDouble();

            System.out.print("Enter Marks for Software: ");
            double Subject2 = sc.nextDouble();

            System.out.print("Enter Marks for Multimedia : ");
            double Subject3 = sc.nextDouble();
            sc.nextLine();


            double total = Subject1 + Subject2 + Subject3;
            double average = total / 3;


            char grade;
            if (average >= 85) {
                grade = 'A';
            } else if (average >= 70) {
                grade = 'B';
            } else if (average >= 50) {
                grade = 'C';
            } else if (average >= 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            String result;
            if (average >=50){ result = "Pass";}
            else{ result = "Fail";}

            //OUTPUT
            System.out.println("\n ***** Student Grade Report *****");
            System.out.println("Name: " + name);
            System.out.println("Student ID: " + studentID);
            System.out.println("\n Course: " + coursename);
            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + String.format("%.2f", average));
            System.out.println("Final Grade: " + grade);
            System.out.println("result:  "  + result);
            System.out.println("--------------------------------");
            //  Loops Control
            System.out.print("\nDo you want to calculate another student? (yes/no): ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("\nExiting program... Thank you!");
                break;


            }


        }
        sc.close(); // Close scanner
    }
}
