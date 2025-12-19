import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingApplication extends JFrame {
    public SwingApplication() {
        super("Java Swing Exercise");
        setLayout(new BorderLayout());

        // Create panel for name input
        JPanel namePanel = new JPanel();
        namePanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(10);
        namePanel.add(nameField);
        JButton submitButton = new JButton("Submit");
        namePanel.add(submitButton);

        // Create panel for username input
        JPanel userPanel = new JPanel();
        userPanel.add(new JLabel("Username:"));
        JTextField userField = new JTextField(10);
        userPanel.add(userField);
        JButton loginButton = new JButton("Login");
        userPanel.add(loginButton);

        // Create panel for checkbox and radio button
        JPanel optionPanel = new JPanel();
        JCheckBox acceptTerms = new JCheckBox("Accept Terms");
        optionPanel.add(acceptTerms);
        JRadioButton maleRadio = new JRadioButton("Male");
        optionPanel.add(maleRadio);

        // Create panel for combo box
        JPanel comboPanel = new JPanel();
        String[] languages = {"Java", "Python", "C++"};
        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboPanel.add(comboBox);

        // Create calculator panel with grid layout
        JPanel calcPanel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {"7", "8", "9", "/",
                            "4", "5", "6", "*",
                            "1", "2", "3", "-",
                            "0", ".", "=", "+"};
        for (String text : buttons) {
            calcPanel.add(new JButton(text));
        }

        // Create panel for "Click Me" button
        JPanel clickPanel = new JPanel();
        JButton clickButton = new JButton("Click Me");
        clickButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button Clicked!"));
        clickPanel.add(clickButton);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        // Add panels to frame
        JPanel topPanel = new JPanel(new GridLayout(4, 1));
        topPanel.add(namePanel);
        topPanel.add(userPanel);
        topPanel.add(optionPanel);
        topPanel.add(comboPanel);
        add(topPanel, BorderLayout.NORTH);
        add(calcPanel, BorderLayout.CENTER);
        add(clickPanel, BorderLayout.SOUTH);
        setJMenuBar(menuBar);

        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingApplication();
    }
}
