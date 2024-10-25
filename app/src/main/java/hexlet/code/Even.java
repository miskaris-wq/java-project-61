package hexlet.code;

import java.util.Scanner;

public class Even {

    public static String isEven() {
        int count = 0;

        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");


        int max = 50;
        int min = 1;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while(count < 3) {
            int x = min + (int) (Math.random()*(max - min + 1));
            System.out.println("Question:" + x);
            String answer = scanner.next();
            System.out.println("Your answer:" + answer);
            if (x%2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    count++;
                }
                else{
                    return "'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n Let's try again, " + userName + "!";
                }
            }
            else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    count++;
                }
                else{
                    return "'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.\n Let's try again, " + userName + "!";
                }
            }
        }
        scanner.close();
        return "Congratulations, " + userName + "!";
    }
}
