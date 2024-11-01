package hexlet.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static String prog(){
        int x;
        int num;
        int y;
        String temp = "";
        String[] progression = new String[10];

        Engine.greet();

        System.out.println("What number is missing in the progression?");

        while(Engine.count < 3) {
            x = Engine.getRandomNumber(1,50);
            num = Engine.getRandomNumber(1,10);
            progression[0] = "" + x;

            for (int i = 1; i < 10; i++) {
                x = x + num;
                progression[i] = "" + x;
            }
            y = Engine.getRandomNumber(0,9);
            temp = progression[y];
            progression[y] = "..";
            StringBuilder str_answ = new StringBuilder();
            for (int j = 0; j < progression.length; j++) {
                str_answ.append(progression[j]).append(" ");
            }
            Engine.quest_answ(String.valueOf(str_answ));
            Engine.Equal(temp);
            Engine.count++;
        }
        if (Engine.count ==3) {
            return "Congratulations, " + Engine.userName + "!";
        }
        else {
            return Engine.Equal(temp);
        }
    }
}
