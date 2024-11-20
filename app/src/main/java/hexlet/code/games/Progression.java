package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {

    public static void prog() {

        String[] questions = new String[Engine.getNUMBER_OF_QUESTIONS()];
        String[] answers = new String[Engine.getNUMBER_OF_QUESTIONS()];

        String[] progression = new String[Engine.getVALUE_FOR_RANGE_MASSIVE()];

        for (int i = 0; i < Engine.getNUMBER_OF_QUESTIONS(); i++) {
            int start = Engine.getRandomNumber(Engine.getMIN_VALUE(), Engine.getMAX_VALUE());
            int step = Engine.getRandomNumber(Engine.getMIN_VALUE(), Engine.getMAX_VALUE());

            for (int j = 0; j < progression.length; j++) {
                progression[j] = String.valueOf(start + j * step);
            }

            int missingIndex = Engine.getRandomNumber(Engine.getMIN_VALUE(), progression.length - 1);

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
