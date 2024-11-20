package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    public static void prime() {

        int numberOfQuestions = 3;
        String[] questions = new String[numberOfQuestions];
        String[] answers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {
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
        System.out.println(Engine.game("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questions, answers));
    }
}
