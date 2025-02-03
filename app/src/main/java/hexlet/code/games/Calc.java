package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.MAX_VALUE;
import static hexlet.code.Engine.MIN_VALUE;


public class Calc {

    private static final String[] operations = {"+", "-", "*"};

    public static void calc() {

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTIONS][NUMBER_OF_QUESTIONS - 1];

        generateQuestionsAndAnswers(questionsAndAnswers);

        Engine.game("What is the result of the expression?", questionsAndAnswers);
    }

    private static void generateQuestionsAndAnswers(String[][] questionsAndAnswers) {
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int x = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            int y = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            String operation = operations[Utils.getRandomNumber(0, operations.length - 1)];

            questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 3] = generateQuestion(x, y, operation);
            questionsAndAnswers[i][NUMBER_OF_QUESTIONS - 2] = calculateAnswer(x, y, operation);
        }
    }

    private static String generateQuestion(int x, int y, String operation) {
        return x + " " + operation + " " + y;
    }

    private static String calculateAnswer(int x, int y, String operation) {
        return switch (operation) {
            case "+" -> String.valueOf(x + y);
            case "-" -> String.valueOf(x - y);
            case "*" -> String.valueOf(x * y);
            default -> throw new RuntimeException("unknown operation");
        };
    }
}
