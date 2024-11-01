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

        while(Engine.count < 3) {
            int x = Engine.getRandomNumber(1,50);
            int y = Engine.getRandomNumber(1,50);
            operation = Engine.getRandomNumber(1,3);
            if (operation == 1) {
                Engine.count++;
                Engine.quest_answ(x + " + " + y);
                sum = x + y;
                Engine.Equal(""+sum);
            }
            else if (operation == 2) {
                Engine.count++;
                Engine.quest_answ(x + " - " + y);
                sub = x - y;
                Engine.Equal(""+sub);
            }
            else {
                Engine.count++;
                Engine.quest_answ(x + " * " + y);
                multi = x * y;
                Engine.Equal(""+multi);
            }
        }
        if (Engine.count ==3) {
            return "Congratulations, " + Engine.userName + "!";
        }
        else {
            if (operation == 1) {
                return Engine.Equal(""+sum);
            }
            else if (operation == 2) {
                return Engine.Equal(""+sub);
            }
            else{
                return Engine.Equal(""+multi);
            }
        }
    }
}
