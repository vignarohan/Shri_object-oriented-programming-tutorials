import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== ADD TASKS =====");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = scanner.nextLine();
            tasks.add(task);
        }

        System.out.println("\n===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // Save tasks into task.txt
        try {
            BufferedWriter writer = new BufferedWriter(
                new FileWriter("task.txt")
            );

            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }

            writer.close();

            System.out.println("\nTasks saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }

        // Read tasks from task.txt
        System.out.println("\n===== SAVED TASKS =====");

        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("task.txt")
            );

            String line;
            int number = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println(number + ". " + line);
                number++;
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading tasks.");
        }

        scanner.close();
    }
}
