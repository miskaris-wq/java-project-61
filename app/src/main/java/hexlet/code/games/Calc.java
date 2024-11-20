package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void calc() {
        int numberOfQuestions = 3;
        String[] questions = new String[numberOfQuestions];
        String[] answers = new String[numberOfQuestions];

        String[] operations = {"+", "-", "*"};

        for (int i = 0; i < numberOfQuestions; i++) {
            int x = Engine.getRandomNumber(Engine.getMIN_VALUE(), Engine.getMAX_VALUE());
            int y = Engine.getRandomNumber(Engine.getMIN_VALUE(), Engine.getMAX_VALUE());
            int operationIndex = Engine.getRandomNumber(0, operations.length - 1);

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
            }

            questions[i] = question;
            answers[i] = answer;
        }

        System.out.println(Engine.game("What is the result of the expression?", questions, answers));
    }
}
