package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;

public class Calc {
    public static void calc() {
        final int maxValue = 50;
        final int minValue = 1;
        String[] questions = new String[NUMBER_OF_QUESTIONS];
        String[] answers = new String[NUMBER_OF_QUESTIONS];

        String[] operations = {"+", "-", "*"};

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int x = Utils.getRandomNumber(minValue, maxValue);
            int y = Utils.getRandomNumber(minValue, maxValue);
            int operationIndex = Utils.getRandomNumber(0, operations.length - 1);

            String operation = operations[operationIndex];
            String question = null;
            String answer = null;

            switch (operation) {
                case "+":
                    question = x + " + " + y;
                    answer = String.valueOf(x + y);
                    break;
                case "-":
                    question = x + " - " + y;
                    answer = String.valueOf(x - y);
                    break;
                case "*":
                    question = x + " * " + y;
                    answer = String.valueOf(x * y);
                    break;
                default:
                    question = "Invalid operation";
                    answer = "0";
                    break;

            }
            questions[i] = question;
            answers[i] = answer;
        }

        System.out.println(Engine.game("What is the result of the expression?", questions, answers));
    }
}
