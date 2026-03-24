package com.studyplanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        // Load existing tasks from file
        ArrayList<Task> loadedTasks = FileHandler.loadTasks();
        manager.setTasks(loadedTasks);

        System.out.println("📚 Welcome to Smart Study Planner!");

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            // Handle invalid input
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("❌ Invalid input! Enter a number.");
                continue;
            }

            switch (choice) {

                case 1:
                    // Add Task
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter deadline (e.g., 1 day / today): ");
                    String deadline = scanner.nextLine();

                    System.out.print("Enter difficulty (Easy/Medium/Hard): ");
                    String difficulty = scanner.nextLine();

                    Task task = new Task(name, deadline, difficulty);
                    manager.addTask(task);

                    // Save after adding
                    FileHandler.saveTasks(manager.getTasks());
                    break;

                case 2:
                    // View Tasks
                    manager.viewTasks();
                    manager.checkBurnout();
                    break;

                case 3:
                    // Exit
                    System.out.println("👋 Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}
