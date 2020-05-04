import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(460, 300);
        frame.setTitle("Name converter");
        frame.add(new MainForm().getMainPanel());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
