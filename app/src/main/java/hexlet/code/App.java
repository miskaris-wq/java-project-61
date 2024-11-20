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

        if (choice.equals("1")) {
            Cli.askName();
        }
        if (choice.equals("2")) {
            Even.isEven();
        }
        if (choice.equals("3")) {
            Calc.calc();
        }

        if (choice.equals("4")) {
            GCD.gcd();
        }

        if (choice.equals("5")) {
            Progression.prog();
        }

        if (choice.equals("6")) {
            Prime.prime();
        }

        scanner.close();
    }
}

