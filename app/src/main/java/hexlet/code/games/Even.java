package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;

public class Even {
    public static void isEven() {
        final int MAX_VALUE = 50;
        final int MIN_VALUE = 1;
        String[] questions = new String[NUMBER_OF_QUESTIONS];
        String[] answers = new String[NUMBER_OF_QUESTIONS];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int x = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            questions[i] = String.valueOf(x);
            if (x % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        String str = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        System.out.println(Engine.game(str, questions, answers));
    }
}
