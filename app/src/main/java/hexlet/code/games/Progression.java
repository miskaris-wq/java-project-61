package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;

public class Progression {

    public static void prog() {
        final int maxValue = 50;
        final int minValue = 1;
        final int progressionLength = 10;
        String[] questions = new String[NUMBER_OF_QUESTIONS];
        String[] answers = new String[NUMBER_OF_QUESTIONS];

        generateQuestionsAndAnswers(questions, answers, minValue, maxValue, progressionLength);

        System.out.println(Engine.game("What number is missing in the progression?", questions, answers));
    }

    private static void generateQuestionsAndAnswers(String[] questions, String[] answers, int minValue, int maxValue, int progressionLength) {
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int start = Utils.getRandomNumber(minValue, maxValue);
            int step = Utils.getRandomNumber(minValue, maxValue);
            String[] progression = createProgression(start, step, progressionLength);


            int missingIndex = Utils.getRandomNumber(0, progressionLength - 1);
            answers[i] = progression[missingIndex];
            progression[missingIndex] = "..";

            questions[i] = String.join(" ", progression);
        }
    }

    private static String[] createProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int j = 0; j < length; j++) {
            progression[j] = String.valueOf(start + j * step);
        }
        return progression;
    }
}
