
import java.time.LocalDate;

public class TaskItem implements Comparable
{

    private String projectName;
    private String taskName;
    private String taskDescription;
    private LocalDate taskDate;
    private String taskStatus;

    public TaskItem(){}

    public TaskItem(String projectName, String taskName, String taskDescription,
                        LocalDate taskDate, String taskStatus)
    {
        this.projectName = projectName;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDate = taskDate;
        this.taskStatus = taskStatus;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(LocalDate taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString() {
        return projectName + "   " + taskName + "   " +  taskDescription + "   " + taskDate + "   " + taskStatus;
    }

    @Override
    public int compareTo(Object o)
    {
        TaskItem other = (TaskItem) o;
        return this.getTaskDate().compareTo(other.getTaskDate());
    }
}
