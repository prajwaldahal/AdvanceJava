import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JTextField display;

    // Variables to store calculator state
    private double num1;
    private double num2;
    private String operator;
    private boolean isNewInput;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);

        num1 = 0.0;
        num2 = 0.0;
        operator = "";
        isNewInput = true;

        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (isNewInput) {
                display.setText("");
                isNewInput = false;
            }

            if ("0123456789.".contains(command)) {
                display.setText(display.getText() + command);
            } else if ("+-*/".contains(command)) {
                operator = command;
                System.out.println(display.getText());
                num1 = Double.parseDouble(display.getText());
                isNewInput = true;
            } else if ("=".equals(command)) {
                num2 = Double.parseDouble(display.getText());

                switch (operator) {
                    case "+":
                        display.setText(String.valueOf(num1 + num2));
                        break;
                    case "-":
                        display.setText(String.valueOf(num1 - num2));
                        break;
                    case "*":
                        display.setText(String.valueOf(num1 * num2));
                        break;
                    case "/":
                        if (num2 != 0) {
                            display.setText(String.valueOf(num1 / num2));
                        } else {
                            display.setText("Error");
                        }
                        break;
                }
            } else if ("C".equals(command)) {
                display.setText("");
                num1 = 0.0;
                num2 = 0.0;
                operator = "";
                isNewInput = true;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator();
        });
    }
}
