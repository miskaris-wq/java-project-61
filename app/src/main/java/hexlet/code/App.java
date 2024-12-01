package hexlet.code;
import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even");
        System.out.println(" 3 - Calc\n 4 - GCD\n 5 - Progression\n 6 - Prime\n 0 - Exit");
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        System.out.println();

        switch (choice) {
            case "1":
                Cli.askName();
                break;
            case "2":
                Even.isEven();
                break;
            case "3":
                Calc.calc();
                break;
            case "4":
                GCD.gcd();
                break;
            case "5":
                Progression.prog();
                break;
            case "6":
                Prime.prime();
                break;
            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите правильный номер.");
                break;
        }
    }
}

