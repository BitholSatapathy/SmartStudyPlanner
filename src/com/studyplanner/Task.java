package com.studyplanner;

public class Task {
	private String name;
	private String deadline;
	private String difficulty;
	private int priority;

	// Constructor
	public Task(String name, String deadline, String difficulty) {
		this.name = name;
		this.deadline = deadline;
		this.difficulty = difficulty;
		this.priority = calculatePriority();
	}

	// Priority Calculation
	private int calculatePriority() {
		int score = 0;

		// Difficulty weight
		if (difficulty.equalsIgnoreCase("Hard")) {
			score += 2;
		} else if (difficulty.equalsIgnoreCase("Medium")) {
			score += 1;
		}

		// Deadline weight (simple logic for now)
		if (deadline.toLowerCase().contains("today") || deadline.contains("1")) {
			score += 2;
		} else if (deadline.contains("2") || deadline.contains("3")) {
			score += 1;
		}

		return score;
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getDeadline() {
		return deadline;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public int getPriority() {
		return priority;
	}

	// Convert to file format
	public String toFileString() {
		return name + "," + deadline + "," + difficulty + "," + priority;
	}

	// Display format
	@Override
	public String toString() {
		return "Task: " + name +
			   " | Deadline: " + deadline +
			   " | Difficulty: " + difficulty +
			   " | Priority: " + priority;
	}
}
