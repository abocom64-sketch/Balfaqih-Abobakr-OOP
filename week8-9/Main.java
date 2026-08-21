import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "task.txt";
    private static final int NUMBER_OF_TASKS = 3;

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("===== ADD TASKS =====");

        for (int i = 1; i <= NUMBER_OF_TASKS; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = input.nextLine();
            tasks.add(task);
        }

        System.out.println("\n===== TASK LIST =====");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        saveTasks(tasks);
        displayTasksFromFile();

        input.close();
    }

    private static void saveTasks(ArrayList<String> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }

            System.out.println("\nTasks saved successfully.");
        } catch (IOException e) {
            System.out.println("Unable to save tasks: " + e.getMessage());
        }
    }

    private static void displayTasksFromFile() {
        System.out.println("\n===== TASKS LOADED FROM FILE =====");

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Unable to load tasks: " + e.getMessage());
        }
    }
}
