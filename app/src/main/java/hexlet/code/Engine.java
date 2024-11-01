package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;
    public static String answer;
    public static int count;

    static Scanner scanner = new Scanner(System.in);

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void quest_answ(String quest) {
        System.out.println("Question: " + quest);
        answer = scanner.next();
        System.out.println("Your answer: " + answer);
    }
    public static String Equal(String cor_answer) {
        if (answer.equals(cor_answer)) {
            System.out.println("Correct!");
            return "";
        }
        else {
            count = 3;
            return "'" + Engine.answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + cor_answer + "'" + ".\n Let's try again, " + Engine.userName + "!";

        }
    }
    public static int getRandomNumber() {
        int min = 1;
        int max = 50;
        return min + (int) (Math.random() * (max - min + 1));
    }
}
