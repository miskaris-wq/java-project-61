package hexlet.code.games;
import hexlet.code.Engine;
public class Even {
    public static void isEven() {
        String[] questions = new String[Engine.getNUMBER_OF_QUESTIONS()];
        String[] answers = new String[Engine.getNUMBER_OF_QUESTIONS()];
        for (int i = 0; i < Engine.getNUMBER_OF_QUESTIONS(); i++) {
            int x = Engine.getRandomNumber(Engine.getMIN_VALUE(), Engine.getMAX_VALUE());
            questions[i] = String.valueOf(x);
            if (x % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        String str = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        System.out.println(Engine.game(str, questions, answers));

    }
}
