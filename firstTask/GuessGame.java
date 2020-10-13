package il.study.spring.firstTask;

import javax.swing.*;
import java.util.*;



public class GuessGame {

    public static ArrayList<Integer> scoreStory = new ArrayList<>();

    public static void play(int max) {
        int unknownNumber = randomNumber(max);
        int userNumber = 0;
        int trysCount = 0;

        do {
            trysCount++;
            String userNumberStr = JOptionPane.showInputDialog("Постарайтесь угадать числот загадое машиной ");
            userNumber = Integer.parseInt(userNumberStr);
            if (userNumber > unknownNumber) {
                JOptionPane.showMessageDialog(null, "Моё число меньше.");
            }
            else if (userNumber < unknownNumber) {
                JOptionPane.showMessageDialog(null, "Моё число больше.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Вы угадали! Количество попыток: "+trysCount);
                saveScore(trysCount);
            }
        } while (
                userNumber != unknownNumber
        );

    }

    private static void saveScore(int trysCount) {
        scoreStory.add(trysCount);
        printBestScore(Collections.min(scoreStory));
    }

    ;
    private static int randomNumber(int max) {
        int min = 0;
        return min + (int) (Math.random()*max);
    };

    public static void printBestScore (int bestScore) {
        System.out.println("The best score of the game :" + bestScore);
    }

}
