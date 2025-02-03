package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.MAX_VALUE;
import static hexlet.code.Engine.MIN_VALUE;

public class GCD {

    public static void gcd() {
        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTIONS][];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRound();
        }

        Engine.game("Find the greatest common divisor of given numbers.", questionsAndAnswers);
    }

    private static String[] generateRound(){
        int x = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        int y = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        var correctAnswer = String.valueOf(calculateGCD(x, y));
        return new String[] {x + " " + y, correctAnswer};
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
