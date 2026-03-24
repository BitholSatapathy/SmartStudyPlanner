# Smart Study Planner (CLI)

Smart Study Planner is a command-line Java app that helps students track study tasks, prioritize work, and spot overload early.

## Features

- Add study tasks with name, deadline, and difficulty.
- Automatically calculate task priority.
- View tasks sorted by priority (highest first).
- Show a burnout warning when hard-task load is high.
- Persist tasks to a local file and reload them on startup.

## How Priority Works

Priority is calculated from difficulty and deadline text:

- Difficulty:
	- Hard: +2
	- Medium: +1
	- Easy: +0
- Deadline (string-based logic):
	- Contains "today" or "1": +2
	- Contains "2" or "3": +1
	- Otherwise: +0

Higher score means higher priority.

## Burnout Detection

The app prints a warning when 3 or more tasks are marked as Hard.

## Project Structure

```text
SmartStudyPlanner/
|-- data/
|   |-- tasks.txt
|-- src/
|   |-- com/
|       |-- studyplanner/
|           |-- Main.java
|           |-- Task.java
|           |-- TaskManager.java
|           |-- FileHandler.java
|-- README.md
```

## Requirements

- Java JDK 8 or newer
- PowerShell, Command Prompt, or any terminal

## Run Locally

From the project root:

1. Compile:

```bash
javac -d out src/com/studyplanner/*.java
```

2. Run:

```bash
java -cp out com.studyplanner.Main
```

## Data Storage

- Tasks are stored in: data/tasks.txt
- File format per line:

```text
name,deadline,difficulty,priority
```

Note: On load, the app currently recomputes priority from name/deadline/difficulty.

## Sample Flow

```text
===== MENU =====
1. Add Task
2. View Tasks
3. Exit
Enter your choice:
```

## Current Limitations

- Deadline parsing is simple text matching.
- No edit/delete command yet.
- No tests included yet.

## Future Improvements

- Add task edit and delete options.
- Replace text-based deadlines with real date parsing.
- Add unit tests.
- Optionally add a GUI.

## Author

Bithol Satapathy

## License

This project is intended for educational use.
