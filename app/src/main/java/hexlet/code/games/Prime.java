package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    public static void prime() {
        String[] questions = new String[Engine.getNUMBER_OF_QUESTIONS()];
        String[] answers = new String[Engine.getNUMBER_OF_QUESTIONS()];

        for (int i = 0; i < Engine.getNUMBER_OF_QUESTIONS(); i++) {
            int x = Engine.getRandomNumber(Engine.getMIN_VALUE(), Engine.getMAX_VALUE());
            questions[i] = String.valueOf(x);
            boolean flag = true;

            if (x < 2) {
                flag = false;
            } else {
                for (int j = 2; j <= Math.sqrt(x); j++) {
                    if (x % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            String correctAnswer = flag ? "yes" : "no";

            answers[i] = correctAnswer;
        }
        String str = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        System.out.println(Engine.game(str, questions, answers));
    }
}
