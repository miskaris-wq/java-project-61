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

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int x = Utils.getRandomNumber(minValue, maxValue);
            questions[i] = String.valueOf(x);
            boolean flag = true;

            if (x < 2) {
                flag = false;
            } else {
                for (int j = 2; j <= Math.sqrt(x); j++) {
                    if (x % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            String correctAnswer = flag ? "yes" : "no";

            answers[i] = correctAnswer;
        }
        String str = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        System.out.println(Engine.game(str, questions, answers));
    }
}

