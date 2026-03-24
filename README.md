# 📚 Smart Study Planner (CLI Based)

## 📌 Project Description
Smart Study Planner is a command-line based Java application designed to help students manage their study tasks efficiently. It allows users to add tasks, automatically assigns priority based on deadline and difficulty, and detects potential burnout based on workload.

---

## 🎯 Features
- ➕ Add new study tasks
- 📋 View all tasks sorted by priority
- 🧠 Automatic priority calculation
- ⚠️ Burnout detection (based on workload)
- 💾 Save and load tasks using file handling

---

## 🛠️ Technologies Used
- Java
- OOP (Object-Oriented Programming)
- File Handling (BufferedReader, BufferedWriter)
- Collections (ArrayList)

---

## 📂 Project Structure


SmartStudyPlanner/
├── data/
│ └── tasks.txt
├── src/
│ └── com/
│ └── studyplanner/
│ ├── Task.java
│ ├── TaskManager.java
│ ├── FileHandler.java
│ ├── Main.java
├── README.md


---

## ⚙️ Requirements
- Java JDK 8 or above
- Terminal / Command Prompt

---

## ▶️ How to Run

### 1. Clone the repository

git clone https://github.com/YOUR_USERNAME/SmartStudyPlanner.git


### 2. Navigate to source folder

cd SmartStudyPlanner/src


### 3. Compile the code

javac com/studyplanner/*.java


### 4. Run the program

java com.studyplanner.Main


---

## 🧪 Sample Usage


===== MENU =====

Add Task
View Tasks
Exit

---

## ⚠️ Burnout Detection Logic
- Shows warning if too many hard tasks are added
- Helps user balance workload

---

## 🚧 Future Improvements
- Add GUI interface
- Add task editing and deletion
- Use database instead of file storage

---

## 👨‍💻 Author
- Your Name

---

## 📜 License
This project is for educational purposes only.
