package hexlet.code;

import lombok.Getter;
import lombok.Setter;
import java.util.Scanner;

public class Engine {
    public static final int MAX_VALUE = 50;
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE_COUNTER = 3;
    public static final int MAX_VALUE_FOR_OPERATION = 3;
    public static final int MIN_VALUE_FOR_INDEX = 0;
    public static final int MAX_VALUE_FOR_INDEX = 9;
    public static final int VALUE_FOR_RANGE_MASSIVE = 10;
    public static final int VALUE_FOR_PROGRESS = 10;
    private static final int NUM_FOR_END_LOOP = 4;
    @Getter
    @Setter
    private static String userName;
    @Getter
    @Setter
    private static String answer;
    @Getter
    @Setter
    private static int count;

    static Scanner scanner = new Scanner(System.in);

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void questAnsw(String question) {
        System.out.println("Question: " + question);
        answer = scanner.next();
        System.out.println("Your answer: " + answer);
    }

    public static String isEqual(String correctAnswer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return "";
        } else {
            count = NUM_FOR_END_LOOP;
            String firstPart = "'" + Engine.answer + "'" + " is wrong answer ;(.";
            String middlePart = "Correct answer was " + "'" + correctAnswer + "'.";
            String secondPart = "\n Let's try again, " + Engine.userName + "!";
            return firstPart + middlePart + secondPart;

        }
    }

    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
}
