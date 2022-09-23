package prelim.Reference_Classes;


import java.time.LocalDate;

public class Task {
    String task_title;
    LocalDate due_date;
    public Task(String task_title, int due_date){
        this.task_title = task_title;
        this.due_date = LocalDate.ofEpochDay(due_date);

    }
    public String toString() {
        return "Task title: " + task_title + " Due: "+ due_date;
    }
}
