package hexlet.code.games;
import hexlet.code.Engine;
public class Even {
    public static void isEven() {
        int numberOfQuestions = 3;
        String[] questions = new String[numberOfQuestions];
        String[] answers = new String[numberOfQuestions];
        for (int i = 0; i < numberOfQuestions; i++){
            int x = Engine.getRandomNumber(Engine.getMIN_VALUE(), Engine.getMAX_VALUE());
            questions[i] = String.valueOf(x);
            if (x % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        System.out.println(Engine.game("Answer 'yes' if the number is even, otherwise answer 'no'.", questions, answers));

    }
}
