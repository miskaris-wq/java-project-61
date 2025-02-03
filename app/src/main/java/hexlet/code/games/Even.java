package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.MAX_VALUE;
import static hexlet.code.Engine.MIN_VALUE;

public class Even {

    public static void isEven() {

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTIONS][NUMBER_OF_QUESTIONS - 1];

        generateQuestionsAndAnswers(questionsAndAnswers);

        String instruction = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Engine.game(instruction, questionsAndAnswers);
    }

    private static void generateQuestionsAndAnswers(String[][] questionsAndAnswers) {
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 3] = String.valueOf(number);
            questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 2] = isEvenNumber(number) ? "yes" : "no";
        }
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

