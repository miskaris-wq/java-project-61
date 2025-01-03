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


        generateQuestionsAndAnswers(questions, answers, operations, minValue, maxValue);

        System.out.println(Engine.game("What is the result of the expression?", questions, answers));
    }

    private static void generateQuestionsAndAnswers(String[] questions, String[] answers, String[] operations,
                                                    int minValue, int maxValue) {
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int x = Utils.getRandomNumber(minValue, maxValue);
            int y = Utils.getRandomNumber(minValue, maxValue);
            String operation = operations[Utils.getRandomNumber(0, operations.length - 1)];

            questions[i] = generateQuestion(x, y, operation);
            answers[i] = calculateAnswer(x, y, operation);
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
