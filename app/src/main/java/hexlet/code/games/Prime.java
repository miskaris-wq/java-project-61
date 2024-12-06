package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;

public class Prime {

    public static void prime() {
        final int maxValue = 50;
        final int minValue = 1;
        String[] questions = new String[NUMBER_OF_QUESTIONS];
        String[] answers = new String[NUMBER_OF_QUESTIONS];

        generateQuestionsAndAnswers(questions, answers, minValue, maxValue);

        String instruction = "Answer 'yes' if the given number is prime. Otherwise answer 'no'.";
        System.out.println(Engine.game(instruction, questions, answers));
    }

    private static void generateQuestionsAndAnswers(String[] questions, String[] answers, int minValue, int maxValue) {
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number = Utils.getRandomNumber(minValue, maxValue);
            questions[i] = String.valueOf(number);
            answers[i] = isPrime(number) ? "yes" : "no";
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
