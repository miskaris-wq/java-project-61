package hexlet.games;

import hexlet.code.Engine;

public class Prime {
    public static String prime() {
        Engine.greet();

        while (Engine.count < 3) {
            int x = Engine.getRandomNumber(1,50);
            Engine.quest_answ("" + x);

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

            String result = Engine.Equal(correctAnswer);
            if (!result.isEmpty()) {
                return result;
            }

            Engine.count++;
        }

        return "Поздравляем, " + Engine.userName + "!";
    }
}
