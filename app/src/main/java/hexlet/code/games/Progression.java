package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;

public class Progression {

    public static void prog() {
        final int maxValue = 50;
        final int minValue = 1;
        final int valueForRangeMassive = 10;
        String[] questions = new String[NUMBER_OF_QUESTIONS];
        String[] answers = new String[NUMBER_OF_QUESTIONS];

        String[] progression = new String[valueForRangeMassive];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int start = Utils.getRandomNumber(minValue, maxValue);
            int step = Utils.getRandomNumber(minValue, maxValue);

            for (int j = 0; j < progression.length; j++) {
                progression[j] = String.valueOf(start + j * step);
            }

            int missingIndex = Utils.getRandomNumber(minValue, progression.length - 1);

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
