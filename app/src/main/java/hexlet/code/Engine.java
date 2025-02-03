package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_QUESTIONS = 3;
    public static final int MAX_VALUE = 50;
    public static final int MIN_VALUE = 1;

    public static void game(String instruction, String[][] questionsAndAnswers) {
        String userName = Cli.askName();
        System.out.println(instruction);
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 3]);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 2])) {
                System.out.println("Correct!");
            } else {
                String firstPart = "'" + answer + "' is wrong answer ;(.";
                String middlePart = "Correct answer was '" + questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 2] + "'.";
                String lastPart = "\n Let's try again, " + userName + "!";
                System.out.println(firstPart + middlePart + lastPart);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
