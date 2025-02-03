package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.MAX_VALUE;
import static hexlet.code.Engine.MIN_VALUE;

public class Even {

    public static void isEven() {

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTIONS][];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRound();
        }

        String instruction = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Engine.game(instruction, questionsAndAnswers);
    }
    private static String[] generateRound(){
        int number = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        var correctAnswer = isEvenNumber(number) ? "yes" : "no";
        return new String[] {String.valueOf(number), correctAnswer};
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

