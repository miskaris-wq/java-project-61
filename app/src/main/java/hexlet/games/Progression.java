package hexlet.games;
import hexlet.code.Engine;

public class Progression {
    public static String prog(){
        int x;
        int num;
        int y;
        String temp = "";
        String[] progression = new String[Engine.VALUE_FOR_RANGE_MASSIVE];

        Engine.greet();

        System.out.println("What number is missing in the progression?");

        while(Engine.getCount() < Engine.MAX_VALUE_COUNTER) {
            x = Engine.getRandomNumber(Engine.MIN_VALUE, Engine.MAX_VALUE);
            num = Engine.getRandomNumber(Engine.MIN_VALUE, Engine.VALUE_FOR_PROGRESS);
            progression[0] = "" + x;

            for (int i = 1; i < 10; i++) {
                x = x + num;
                progression[i] = "" + x;
            }
            y = Engine.getRandomNumber(Engine.MIN_VALUE_FOR_INDEX,Engine.MAX_VALUE_FOR_INDEX);
            temp = progression[y];
            progression[y] = "..";
            StringBuilder str_answ = new StringBuilder();
            for (String s : progression) {
                str_answ.append(s).append(" ");
            }
            Engine.questAnsw(String.valueOf(str_answ));
            Engine.isEqual(temp);
            Engine.setCount(Engine.getCount()+1);
        }
        if (Engine.getCount() == Engine.MAX_VALUE_COUNTER) {
            return "Congratulations, " + Engine.getUserName() + "!";
        }
        else {
            return Engine.isEqual(temp);
        }
    }
}
