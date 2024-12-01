package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;

public class Progression {

    public static void prog() {
        final int MAX_VALUE = 50;
        final int MIN_VALUE = 1;
        final int VALUE_FOR_RANGE_MASSIVE = 10;
        String[] questions = new String[NUMBER_OF_QUESTIONS];
        String[] answers = new String[NUMBER_OF_QUESTIONS];

        String[] progression = new String[VALUE_FOR_RANGE_MASSIVE];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int start = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            int step = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);

            for (int j = 0; j < progression.length; j++) {
                progression[j] = String.valueOf(start + j * step);
            }

            int missingIndex = Utils.getRandomNumber(MIN_VALUE, progression.length - 1);

            answers[i] = progression[missingIndex];

            progression[missingIndex] = "..";

            StringBuilder question = new StringBuilder();
            for (String s : progression) {
                question.append(s).append(" ");
            }
            questions[i] = question.toString().trim();
        }

        System.out.println(Engine.game("What number is missing in the progression?", questions, answers));
    }
}
