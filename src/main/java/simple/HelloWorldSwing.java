package simple;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorldSwing");
        final JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}