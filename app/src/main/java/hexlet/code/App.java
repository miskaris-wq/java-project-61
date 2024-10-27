package hexlet.code;
import hexlet.games.Calc;
import hexlet.games.Even;

import java.util.Scanner;
class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even\n 3 - Calc \n 0 - Exit");
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        System.out.println();

        if (choice.equals("1")) {
            Cli.askName();
        }
        if (choice.equals("2")) {
            System.out.println(Even.isEven());
        }
        if (choice.equals("3")) {
            System.out.println(Calc.calc());
        }
        scanner.close();

    }
}
