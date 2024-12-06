package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;

public class GCD {

    public static void gcd() {
        final int maxValue = 50;
        final int minValue = 1;
        String[] questions = new String[NUMBER_OF_QUESTIONS];
        String[] answers = new String[NUMBER_OF_QUESTIONS];

        generateQuestionsAndAnswers(questions, answers, minValue, maxValue);

        System.out.println(Engine.game("Find the greatest common divisor of given numbers.", questions, answers));
    }

    private static void generateQuestionsAndAnswers(String[] questions, String[] answers, int minValue, int maxValue) {
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int x = Utils.getRandomNumber(minValue, maxValue);
            int y = Utils.getRandomNumber(minValue, maxValue);
            questions[i] = x + " " + y;
            answers[i] = String.valueOf(calculateGCD(x, y));
        }
    }

    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
