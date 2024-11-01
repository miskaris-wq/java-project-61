package hexlet.games;
import hexlet.code.Engine;

public class Even {

    public static String isEven() {
        int x = 0;

        Engine.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (Engine.getCount() < Engine.MAX_VALUE_COUNTER) {
            x = Engine.getRandomNumber(Engine.MIN_VALUE, Engine.MAX_VALUE);
            Engine.questAnsw("" + x);
            Engine.setCount(Engine.getCount() + 1);
            if (x % 2 == 0) {
                Engine.isEqual("yes");
            } else {
                Engine.isEqual("no");

            }
        }

        if (Engine.getCount() == Engine.MAX_VALUE_COUNTER) {
        return "Congratulations, " + Engine.getUserName() + "!";
        } else {
            if (x % 2 == 0){
                return Engine.isEqual("yes");
            } else {
                return Engine.isEqual("no");
            }
        }
    }
}
