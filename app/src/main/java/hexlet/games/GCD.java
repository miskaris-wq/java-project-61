package hexlet.games;
import hexlet.code.Engine;

public class GCD {
    public static String gcd() {
        Engine.greet();
        int gcd = 0;
        while (Engine.count < 3) {
           int x = Engine.getRandomNumber();
           int y = Engine.getRandomNumber();
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
