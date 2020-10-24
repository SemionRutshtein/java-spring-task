package il.study.spring.my_spring.object_factory;

import javax.swing.*;

public class PopupSpeaker implements Speaker {


    @Override
    public void speak(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
