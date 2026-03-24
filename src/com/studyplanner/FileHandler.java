package com.studyplanner;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

	private static final String FILE_PATH = "data/tasks.txt";

	// Save tasks to file
	public static void saveTasks(ArrayList<Task> tasks) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
			for (Task task : tasks) {
				writer.write(task.toFileString());
				writer.newLine();
			}
			System.out.println("💾 Tasks saved successfully!");
		} catch (IOException e) {
			System.out.println("❌ Error saving tasks.");
			e.printStackTrace();
		}
	}

	// Load tasks from file
	public static ArrayList<Task> loadTasks() {
		ArrayList<Task> tasks = new ArrayList<>();

		File file = new File(FILE_PATH);

		// If file doesn't exist, return empty list
		if (!file.exists()) {
			return tasks;
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
			String line;

			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");

				if (parts.length >= 3) {
					String name = parts[0];
					String deadline = parts[1];
					String difficulty = parts[2];

					Task task = new Task(name, deadline, difficulty);
					tasks.add(task);
				}
			}

		} catch (IOException e) {
			System.out.println("❌ Error loading tasks.");
			e.printStackTrace();
		}

		return tasks;
	}
}
