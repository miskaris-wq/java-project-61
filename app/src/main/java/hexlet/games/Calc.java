package hexlet.games;
import hexlet.code.Engine;

public class Calc {

    public static String calc() {
        int operation = 0;
        int sum = 0;
        int sub = 0;
        int multi = 0;

        Engine.greet();

        System.out.println("What is the result of the expression?");

        while (Engine.getCount() < Engine.MAX_VALUE_COUNTER) {
            int x = Engine.getRandomNumber(Engine.MIN_VALUE, Engine.MAX_VALUE);
            int y = Engine.getRandomNumber(Engine.MIN_VALUE, Engine.MAX_VALUE);
            operation = Engine.getRandomNumber(Engine.MIN_VALUE,Engine.MAX_VALUE_FOR_OPERATION);
            if (operation == 1) {
                Engine.setCount(Engine.getCount() + 1);
                Engine.questAnsw(x + " + " + y);
                sum = x + y;
                Engine.isEqual("" + sum);
            } else if (operation == 2) {
                Engine.setCount(Engine.getCount() + 1);
                Engine.questAnsw(x + " - " + y);
                sub = x - y;
                Engine.isEqual("" + sub);
            } else {
                Engine.setCount(Engine.getCount() + 1);
                Engine.questAnsw(x + " * " + y);
                multi = x * y;
                Engine.isEqual("" + multi);
            }
        }
        if (Engine.getCount() == Engine.MAX_VALUE_COUNTER) {
            return "Congratulations, " + Engine.getUserName() + "!";
        }
        else {
            if (operation == 1) {
                return Engine.isEqual("" + sum);
            } else if (operation == 2) {
                return Engine.isEqual("" + sub);
            } else{
                return Engine.isEqual("" + multi);
            }
        }
    }
}
