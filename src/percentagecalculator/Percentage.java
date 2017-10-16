package percentagecalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alamm7 on 10/11/17.
 */
public class Percentage {
    private JButton calculateButton;
    private JTextField whatISTextField;
    private JButton clearButton;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel panel1;
     private JButton exitButton;


    public Percentage() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whatISTextField.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;

                num1 = Float.parseFloat(whatISTextField.getText());
                num2 = Float.parseFloat(textField2.getText());
                result = num2 / 100 * num1;

                textField3.setText(String.valueOf(result));

            }
        });
    }



    private void createUIComponents() {

    }
}
