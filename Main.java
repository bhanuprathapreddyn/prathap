package holiday_lights_ordering_portal;

import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            menu.displayMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose Light Shape: ");
            String input = scanner.nextLine();
            Boolean flag = menu.orderSelection(input);
            if(flag == true) {
                break;
            }
            // write your code here
        }
    }

}
