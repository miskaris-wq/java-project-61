package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_QUESTIONS = 3;

    private static String greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    private static String questionAnsw(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + question);
        String answer = scanner.next();
        System.out.println("Your answer: " + answer);
        return answer;
    }

    public static String game(String str, String[] questions, String[] correctAnswers) {
        String userName = greet();
        int count = 0;
        System.out.println(str);
        while (count < NUMBER_OF_QUESTIONS) {
            String answer = questionAnsw(questions[count]);
            if (answer.equals(correctAnswers[count])) {
                System.out.println("Correct!");
            } else {
                String firstPart = "'" + answer + "' is wrong answer ;(.";
                String middlePart = "Correct answer was '" + correctAnswers[count] + "'.";
                String secondPart = "\n Let's try again, " + userName + "!";
                return firstPart + middlePart + secondPart;
            }
            count++;
        }
        return "Congratulations, " + userName + "!";
    }
}