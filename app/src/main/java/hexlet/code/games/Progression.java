package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.MAX_VALUE;
import static hexlet.code.Engine.MIN_VALUE;

public class Progression {

    private static final int progressionLength = 10;

    public static void prog() {

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTIONS][NUMBER_OF_QUESTIONS - 1];

        generateQuestionsAndAnswers(questionsAndAnswers);

        Engine.game("What number is missing in the progression?", questionsAndAnswers);
    }

    private static void generateQuestionsAndAnswers(String[][] questionsAndAnswers) {
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int start = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            int step = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            String[] progression = createProgression(start, step);

            int missingIndex = Utils.getRandomNumber(0, progressionLength - 1);
            questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 2] = progression[missingIndex];
            progression[missingIndex] = "..";

            questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 3] = String.join(" ", progression);
        }
    }

    private static String[] createProgression(int start, int step) {
        String[] progression = new String[progressionLength];
        for (int j = 0; j < progressionLength; j++) {
            progression[j] = String.valueOf(start + j * step);
        }
        return progression;
    }
}
