package il.study.spring.firstTask;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
    GuessGame guessGame = new GuessGame();
    String maxNumberStr = JOptionPane.showInputDialog("Введите максимальное число: ");
    int maxNumber = Integer.parseInt(maxNumberStr);
    guessGame.play(maxNumber);

    }
}
