package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.MAX_VALUE;
import static hexlet.code.Engine.MIN_VALUE;

public class Prime {

    public static void prime() {
        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTIONS][];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRound();
        }

        String instruction = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.game(instruction, questionsAndAnswers);
    }
    private static String[] generateRound(){
        int number = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        var correctAnswer = isPrime(number) ? "yes" : "no";
        return new String[] {String.valueOf(number), correctAnswer};
    }
 
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
