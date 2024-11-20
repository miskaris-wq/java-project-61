package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcd() {
        String[] questions = new String[Engine.getNUMBER_OF_QUESTIONS()];
        String[] answers = new String[Engine.getNUMBER_OF_QUESTIONS()];
        int gcd = 0;
        for (int i = 0; i < Engine.getNUMBER_OF_QUESTIONS(); i++) {
            int x = Engine.getRandomNumber(Engine.getMIN_VALUE(), Engine.getMAX_VALUE());
            int y = Engine.getRandomNumber(Engine.getMIN_VALUE(), Engine.getMAX_VALUE());
            for (int j = 1; j <= Math.min(x, y); j++) {
                if (x % j == 0 && y % j == 0) {
                    gcd = j;
                }
            }
            questions[i] = x + " " + y;
            answers[i] = String.valueOf(gcd);

        }
        System.out.println(Engine.game("Find the greatest common divisor of given numbers.", questions, answers));

    }
}
