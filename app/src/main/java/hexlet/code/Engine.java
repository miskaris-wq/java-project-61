package hexlet.code;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Engine {
    @Getter
    private static final int MAX_VALUE_COUNTER = 3;
    @Getter
    private static final int MAX_VALUE = 50;
    @Getter
    private static final int MIN_VALUE = 1;
    @Getter
    private static final int VALUE_FOR_RANGE_MASSIVE = 10;
    @Getter
    private static final int VALUE_FOR_PROGRESS = 10;
    @Getter
    @Setter
    private static String userName;
    @Getter
    @Setter
    private static String answer;
    @Getter
    @Setter
    private static int count = 0;
    @Getter
    @Setter
    private static Scanner scanner = new Scanner(System.in);

    private static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    private static void questAnsw(String question) {
        System.out.println("Question: " + question);
        answer = scanner.next();
        System.out.println("Your answer: " + answer);
    }

    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
    public static String game (String str, String[] questions, String correctAnswers[]) {
        Engine.greet();
        System.out.println(str);
        while (Engine.getCount() < Engine.MAX_VALUE_COUNTER) {
            questAnsw(questions[getCount()]);
            if (answer.equals(correctAnswers[getCount()])) {
                System.out.println("Correct!");

            } else {
                String firstPart = "'" + Engine.answer + "'" + " is wrong answer ;(.";
                String middlePart = "Correct answer was " + "'" + correctAnswers[getCount()] + "'.";
                String secondPart = "\n Let's try again, " + Engine.userName + "!";
                return firstPart + middlePart + secondPart;
            }
            Engine.setCount(Engine.getCount() + 1);
        }
        return "Congratulations, " + Engine.getUserName() + "!";
    }
}

