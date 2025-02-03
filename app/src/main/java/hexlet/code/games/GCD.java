package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.MAX_VALUE;
import static hexlet.code.Engine.MIN_VALUE;

public class GCD {

    public static void gcd() {
        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTIONS][NUMBER_OF_QUESTIONS - 1];

        generateQuestionsAndAnswers(questionsAndAnswers);

        Engine.game("Find the greatest common divisor of given numbers.", questionsAndAnswers);
    }

    private static void generateQuestionsAndAnswers(String[][] questionsAndAnswers) {
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int x = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            int y = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 3] = x + " " + y;
            questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 2] = String.valueOf(calculateGCD(x, y));
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
