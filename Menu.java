import java.text.ParseException;
import java.util.Scanner;

public class Menu {
    public Scanner input = new Scanner(System.in);
    public int selection = 0;
    ToDoList toDoList = new ToDoList();

    public void mainMenu() throws ParseException {

        System.out.println("*********************************************************");
        System.out.println("\n**       Welcome to the ToDo List Application       **\n");
        System.out.println("*********************************************************");

        printMenu();
    }

    public void printMenu() throws ParseException {
        do {
            System.out.println("1 - Show Task List ");
            System.out.println("2 - Add New Task ");
            System.out.println("3 - Edit Task");
            System.out.println("4 - Save and Quit");
            System.out.print("\nSelect from the menu:  ");

            selection = input.nextInt();
            switch (selection) {
                case 1:
                    showTaskList();
                    break;
                case 2:
                    toDoList.addNewTask();
                    break;
                case 3:
                    editTask();
                    break;
                case 4:
                    System.out.println(" ********  Thanks for using the system!  ******** ");
                    //input.close();
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }

        } while (selection != 4);
    }

    public void showTaskList() throws ParseException {
        do {
            System.out.println("1 - All Task ");    // everything
            System.out.println("2 - By Date ");     // everything but sorted ascending by date
            System.out.println("3 - By Project");   // everything but sorted ascending by project name
            System.out.println("4 - Back to main menu ");
            System.out.print("\nSelect from the menu:  ");

            selection = input.nextInt();
            switch (selection) {
                case 1:
                    toDoList.showAll();
                    break;
                case 2:
                    toDoList.showByDate();
                    break;
                case 3:
                    toDoList.showByProject();
                    break;
                case 4:
                    printMenu();
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        } while (selection != 4);
    }
            public void editTask(){
                System.out.println("1 - Update ");
                System.out.println("2 - Mark as done ");
                System.out.println("3 - Remove");
                System.out.println("4 - Back to main menu ");
                System.out.print("\nSelect from the menu:  ");
            }

    }

