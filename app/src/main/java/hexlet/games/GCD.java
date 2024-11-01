package hexlet.games;
import hexlet.code.Engine;

public class GCD {
    public static String gcd() {

        Engine.greet();

        int gcd = 0;
        int x = 0;
        int y = 0;

        System.out.println("Find the greatest common divisor of given numbers.");

        while (Engine.count < 3) {
           x = Engine.getRandomNumber(1,50);
           y = Engine.getRandomNumber(1,50);
           for (int i = 1; i <= Math.min(x,y); i++) {
               if (x % i == 0 && y % i == 0) {
                   gcd = i;
                   }
           }
            Engine.quest_answ(x + " " + y);
            Engine.Equal(""+gcd);
            Engine.count++;
        }
        if (Engine.count ==3) {
            return "Congratulations, " + Engine.userName + "!";
        }
        else {
            return Engine.Equal(""+gcd);
        }
    }
}
