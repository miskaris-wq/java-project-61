package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.MAX_VALUE;
import static hexlet.code.Engine.MIN_VALUE;

public class Progression {

    private static final int PROGRESSION_LENGTH = 10;

    public static void prog() {

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTIONS][];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRound();
        }

        Engine.game("What number is missing in the progression?", questionsAndAnswers);
    }

    private static String[] generateRound() {
        int start = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        int step = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        String[] progression = createProgression(start, step);
        int missingIndex = Utils.getRandomNumber(0, PROGRESSION_LENGTH - 1);
        var correctAnswer = progression[missingIndex];
        progression[missingIndex] = "..";

        return new String[] {String.join(" ", progression), correctAnswer};
    }

    private static String[] createProgression(int start, int step) {
        String[] progression = new String[Progression.PROGRESSION_LENGTH];
        for (int j = 0; j < Progression.PROGRESSION_LENGTH; j++) {
            progression[j] = String.valueOf(start + j * step);
        }
        return progression;
    }
}
