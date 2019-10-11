import java.util.Scanner;

public class TestMenu {

    boolean quit;
    Scanner input = new Scanner(System.in);
    public void menuHeader() {
        System.out.println("*********************************************************");
        System.out.println("\n**       Welcome to the ToDo List Application       **\n");
        System.out.println("*********************************************************");
    }

    public void mainMenu() {
        System.out.println("\n Select from the menu");
        System.out.println("------------------------\n");
        System.out.println("1 - Show Task List ");
        System.out.println("2 - Add New Task ");
        System.out.println("3 - Edit Task");
        System.out.println("4 - Save and Quit");
    }

    public void performAction(int userInput) {
            //chooseMenu = input.nextInt();
            switch (userInput) {
                case 1:
                    showTaskList();
                    break;
                case 2:

                    break;
                case 3:
                    editTask();
                    break;
                case 4:
                    quit = true;
                    System.out.println(" ********  Thanks for using the application.  ******** ");
                    input.close();
            }
        }

        public void runMenu(){
            menuHeader();
            while (!quit){
                mainMenu();
                int userInput = checkInput();
                performAction(userInput);
            }
        }

        public int checkInput(){
            //Scanner input = new Scanner(System.in);
            int userInput = 0;
            while (userInput < 1 || userInput > 4){
                try {
                    System.out.print("Enter your selection: ");
                    userInput = Integer.parseInt(input.nextLine());
                }
                catch (NumberFormatException e){
                    System.out.println("Invalid selection. Please try again.");
                }
            }
            return userInput;
        }


    public void showTaskList() {
        System.out.println("\n Select from the menu");
        System.out.println("------------------------ ");
        System.out.println("1 - All Task ");
        System.out.println("2 - By Date ");
        System.out.println("3 - By Project");
        System.out.println("4 - Back to main menu ");
    }

    public void editTask() {
        System.out.println("\n Select from the menu");
        System.out.println("------------------------ ");
        System.out.println("1 - Update ");
        System.out.println("2 - Mark as done ");
        System.out.println("3 - Remove");
        System.out.println("4 - Back to main menu ");
    }
}
