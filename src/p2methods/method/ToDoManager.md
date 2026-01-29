# Multi-User To-Do List Manager
## Single File Java Project

A simple command-line task management system in **one file** demonstrating Java methods concepts.

## File Structure
```
ToDoManager.java    (Contains all classes in single file)
├── ToDoManager class (main method + command line args)
├── Task class (encapsulation demo)
├── User class (instance methods)
└── TeamTask class (static methods)
```

## Concepts Covered

### 1. **Instance Methods** (User class)
- Methods that belong to object instances
- Each user has their own task list
- Called using object: `user.addTask()`

### 2. **Static Methods** (TeamTask class)
- Methods that belong to the class itself
- Shared across all users
- Called using class name: `TeamTask.addSharedTask()`

### 3. **Access Modifiers**
- `private`: Task fields (description, completed, priority)
- `public`: All methods for external access
- Demonstrates proper encapsulation

### 4. **Command Line Arguments**
- Accepts username via `String[] args`
- Validates input before execution
- Shows how to process user input

## How to Compile and Run

### Compile:
```bash
javac ToDoManager.java
```

### Run:
```bash
java ToDoManager John
```

### Run with different username:
```bash
java ToDoManager Alice
```

## Sample Output

```
Welcome to To-Do Manager, John!

John added: Complete Java assignment
John added: Read chapter 5
John added: Practice coding problems

John's Tasks:
========================================
1. [ ] Complete Java assignment (Priority: High)
2. [ ] Read chapter 5 (Priority: Medium)
3. [ ] Practice coding problems (Priority: High)

Completing task #1...
Task completed!

John's Tasks:
========================================
1. [✓] Complete Java assignment (Priority: High)
2. [ ] Read chapter 5 (Priority: Medium)
3. [ ] Practice coding problems (Priority: High)

Adding team tasks...
Team task added: Prepare presentation
Team task added: Review code

Team Shared Tasks:
========================================
1. [ ] Prepare presentation (Priority: High)
2. [ ] Review code (Priority: Medium)

Completing team task #1...
Team task completed!

Team Shared Tasks:
========================================
1. [✓] Prepare presentation (Priority: High)
2. [ ] Review code (Priority: Medium)

John's Stats:
Total: 3 | Completed: 1 | Pending: 2

Team Statistics:
Total: 2 | Completed: 1 | Created: 2
```

## Code Breakdown

### Task Class
- **Purpose**: Represents a single task
- **Key Features**:
    - Private fields for encapsulation
    - Public methods for access
    - toString() for easy display

### User Class (Instance Methods)
- **Purpose**: Manages personal tasks for each user
- **Key Methods**:
    - `addTask()` - Add personal task
    - `displayTasks()` - Show user's tasks
    - `completeTask()` - Mark task as done
    - `showStats()` - Display statistics

### TeamTask Class (Static Methods)
- **Purpose**: Manages shared team tasks
- **Key Methods**:
    - `addSharedTask()` - Add team task
    - `displaySharedTasks()` - Show shared tasks
    - `completeSharedTask()` - Mark team task done
    - `displayStatistics()` - Team stats

### Main Class
- **Purpose**: Entry point and demo
- **Features**:
    - Command line argument handling
    - Demonstrates both instance and static methods
    - Shows difference between personal and shared data

## Learning Points

1. **Single File Structure**: All classes in one `.java` file (only public class can match filename)
2. **Instance vs Static**: Clear difference between object-specific and class-level methods
3. **Encapsulation**: Private data with public methods
4. **Command Line Args**: Processing user input from terminal
5. **ArrayList**: Dynamic array for storing tasks

## Common Mistakes to Avoid

❌ Forgetting to provide username
```bash
java ToDoManager    # Wrong!
```

✅ Always provide username
```bash
java ToDoManager John    # Correct!
```

❌ Trying to access private fields directly
```java
task.description = "New";  // Won't work - private field
```

✅ Use public methods
```java
String desc = task.toString();  // Correct way
```

## Extension Ideas

- Add task deletion feature
- Implement task editing
- Add due dates
- Save tasks to file
- Multiple users at once
- Task search functionality
- Priority-based sorting

## Why Single File?

✅ Easy to share and run
✅ Simple compilation
✅ Good for learning and demos
✅ No package/folder structure needed


**Happy Learning! 🚀**

*Contributions and suggestions are welcome!*

---

**Maintained by: [Sablu Chaudhary](https://github.com/sabluchaudhary555)** 🔗 **Connect with me:** [LinkedIn](https://www.linkedin.com/in/sablu-chaudhary555/) | [GitHub](https://github.com/sabluchaudhary555)

---
**Made with ❤️ for the Open Source Community**