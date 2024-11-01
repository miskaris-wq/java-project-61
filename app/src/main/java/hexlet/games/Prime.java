package hexlet.games;
import hexlet.code.Engine;

public class Prime {
    public static String prime() {

        Engine.greet();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (Engine.getCount() < Engine.MAX_VALUE_COUNTER) {
            int x = Engine.getRandomNumber(Engine.MIN_VALUE, Engine.MAX_VALUE);
            Engine.questAnsw("" + x);

            boolean flag = true;

            if (x < 2) {
                flag = false;
            } else {
                for (int i = 2; i <= Math.sqrt(x); i++) {
                    if (x % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            String correctAnswer = flag ? "yes" : "no";

            String result = Engine.isEqual(correctAnswer);
            if (!result.isEmpty()) {
                return result;
            }

            Engine.setCount(Engine.getCount()+1);
        }
        return "Congratulations, " + Engine.getUserName() + "!";
    }
}
