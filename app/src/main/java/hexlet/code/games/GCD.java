package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;

public class GCD {
    public static void gcd() {
        final int MAX_VALUE = 50;
        final int MIN_VALUE = 1;
        String[] questions = new String[NUMBER_OF_QUESTIONS];
        String[] answers = new String[NUMBER_OF_QUESTIONS];
        int gcd = 0;
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int x = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            int y = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            for (int j = 1; j <= Math.min(x, y); j++) {
                if (x % j == 0 && y % j == 0) {
                    gcd = j;
                }
            }
            questions[i] = x + " " + y;
            answers[i] = String.valueOf(gcd);

        }
        System.out.println(Engine.game("Find the greatest common divisor of given numbers.", questions, answers));

    }
}
