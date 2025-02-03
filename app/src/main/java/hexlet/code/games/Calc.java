package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.MAX_VALUE;
import static hexlet.code.Engine.MIN_VALUE;


public class Calc {

    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void calc() {

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTIONS][];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRound();
        }

        Engine.game("What is the result of the expression?", questionsAndAnswers);
    }
    private static String[] generateRound() {
        int x = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        int y = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        String operation = OPERATIONS[Utils.getRandomNumber(0, OPERATIONS.length - 1)];
        var correctAnswer = calculateAnswer(x, y, operation);
        return new String[] {generateQuestion(x, y, operation), correctAnswer};
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
