package hexlet.games;
import hexlet.code.Engine;

public class GCD {
    public static String gcd() {

        Engine.greet();

        int gcd = 0;
        int x;
        int y;

        System.out.println("Find the greatest common divisor of given numbers.");

        while (Engine.getCount() < Engine.MAX_VALUE_COUNTER) {
           x = Engine.getRandomNumber(Engine.MIN_VALUE, Engine.MAX_VALUE);
           y = Engine.getRandomNumber(Engine.MIN_VALUE, Engine.MAX_VALUE);
           for (int i = 1; i <= Math.min(x, y); i++) {
               if (x % i == 0 && y % i == 0) {
                   gcd = i;
                   }
           }
            Engine.questAnsw(x + " " + y);
            Engine.isEqual("" + gcd);
            Engine.setCount(Engine.getCount() + 1);
        }
        if (Engine.getCount() == Engine.MAX_VALUE_COUNTER) {
            return "Congratulations, " + Engine.getUserName() + "!";
        } else {
            return Engine.isEqual("" + gcd);
        }
    }
}
