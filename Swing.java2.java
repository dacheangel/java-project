
import javax.swing.*;
import java.awt.*;

public class SwingProgram {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Swing Structure");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Name:");

        // Create a text field
        JTextField textField = new JTextField(10);

        // Create a button
        JButton button = new JButton("Submit");

        // Add components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Add panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
