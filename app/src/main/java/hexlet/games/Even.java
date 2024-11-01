package hexlet.games;

import hexlet.code.Engine;

public class Even {

    public static String isEven() {
        int x = 0;

        Engine.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (Engine.count < 3) {
            x = Engine.getRandomNumber();
            Engine.quest_answ("" + x);
            Engine.count++;
            if (x%2 == 0) {
                Engine.Equal("yes");
            }
            else {
                Engine.Equal("no");

            }
        }

        if (Engine.count ==3) {
        return "Congratulations, " + Engine.userName + "!";
        }
        else {
            if (x%2 == 0){
                return Engine.Equal("yes");
            }
            else{
                return Engine.Equal("no");
            }
        }
    }
}
