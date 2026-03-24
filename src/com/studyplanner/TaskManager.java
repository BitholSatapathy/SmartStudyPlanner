package com.studyplanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TaskManager {
	private ArrayList<Task> tasks;

	// Constructor
	public TaskManager() {
		tasks = new ArrayList<>();
	}

	// Add Task
	public void addTask(Task task) {
		tasks.add(task);
		System.out.println("✅ Task added successfully!");
	}

	// View Tasks (sorted by priority)
	public void viewTasks() {
		if (tasks.isEmpty()) {
			System.out.println("⚠️ No tasks available.");
			return;
		}

		// Sort by priority (descending)
		Collections.sort(tasks, new Comparator<Task>() {
			@Override
			public int compare(Task t1, Task t2) {
				return t2.getPriority() - t1.getPriority();
			}
		});

		System.out.println("\n📋 Your Tasks:");
		for (Task task : tasks) {
			System.out.println(task);
		}
	}

	// Burnout Detection
	public void checkBurnout() {
		int hardCount = 0;

		for (Task task : tasks) {
			if (task.getDifficulty().equalsIgnoreCase("Hard")) {
				hardCount++;
			}
		}

		if (hardCount >= 3) {
			System.out.println("\n⚠️ High workload detected!");
			System.out.println("Consider reducing hard tasks or rescheduling.");
		}
	}

	// Get all tasks (for file saving later)
	public ArrayList<Task> getTasks() {
		return tasks;
	}

	// Load tasks from file
	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
}
