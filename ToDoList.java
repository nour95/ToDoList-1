
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class ToDoList
{
    List<TaskItem> taskItemList = new ArrayList<TaskItem>();
    Scanner input = new Scanner(System.in);

    public ToDoList()
    {

        taskItemList.add(new TaskItem("project1", "task1", "project1 & task1", LocalDate.now(), "done"));
        taskItemList.add(new TaskItem("project2", "task1", "project2 & task1", LocalDate.now(), "done"));
        taskItemList.add(new TaskItem("project1", "task2", "project1 & task2", LocalDate.now(), "in process"));
    }


    public void showAll() {
        for (int i =0; i < taskItemList.size(); i++) {
            System.out.println(i + " " + taskItemList.get(i));
        }
    }

    public void showByDate() {
        Collections.sort(taskItemList);
        showAll();
    }

    public void showByProject2(){
        //group by project
        Map<String, List<TaskItem>> groupByProjectMap =
                taskItemList.stream().collect( Collectors.groupingBy(TaskItem::getProjectName));
        System.out.println(groupByProjectMap);

    }

    public void showByProject(){
        //Sort by project
        List<TaskItem> sortedList = taskItemList.stream()
                .sorted(Comparator.comparing(TaskItem::getProjectName))
                .collect(Collectors.toList());

        for (TaskItem task: sortedList)
        {
            System.out.println(task);
        }
    }

    public void addNewTask () throws ParseException {
        TaskItem taskItem = new TaskItem();

        System.out.println("Enter project name : ");
        taskItem.setProjectName(input.nextLine()) ;

        System.out.println("Enter task name : ");
        taskItem.setTaskName(input.nextLine());

        System.out.println("Enter task description : ");
        taskItem.setTaskDescription(input.nextLine());

        System.out.println("Enter task date as dd-mm-yyyy: ");
        taskItem.setTaskDate(convertStringToDate(input.nextLine()));

        System.out.println("Enter task status : ");
        taskItem.setTaskStatus(input.nextLine());

        taskItemList.add(taskItem);
        for (TaskItem taskItem1: taskItemList){
            System.out.println(taskItem1);
        }
    }

    // convert taskDate As string to taskDate As Date
    public LocalDate convertStringToDate(String dateString)
    {
        LocalDate date = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while(true)
        {
            try{
                date = LocalDate.parse(dateString, formatter);
                System.out.println(date);
                return date;
            }
            catch ( Exception e ){
                System.out.println("Invalid date. Please try again. ");
                dateString = input.nextLine();

            }
        }
    }
}
