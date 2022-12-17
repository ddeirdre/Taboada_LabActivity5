package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JLabel label;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        setTitle("Simple Calculator");
        btnCompute.addActionListener((event) ->{
            try {
                double n1 = Double.parseDouble(tfNumber1.getText());
                double n2 = Double.parseDouble(tfNumber2.getText());
                String ops = (String) cbOperations.getSelectedItem();

                double res = 0;
                {
                    switch (ops) {
                        case "+" -> res = n1 + n2;
                        case "-" -> res = n1 - n2;
                        case "*" -> res = n1 * n2;
                        case "/" -> {
                            if (n2 == 0) {
                                throw new ArithmeticException("Divisor cannot be 0");
                            }
                            res = n1 / n2;
                        }
                    }
                }

                lblResult.setText(Double.toString(res));
            } catch (NumberFormatException boot2) {
                JOptionPane.showMessageDialog(SimpleCalcGUI.this, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException div){
                JOptionPane.showMessageDialog(SimpleCalcGUI.this, "Cannot be divided by 0", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SimpleCalcGUI dsp = new SimpleCalcGUI();
        dsp.setContentPane(new SimpleCalcGUI().panel1);
        dsp.setSize(550, 400);
        dsp.setVisible(true);
    }
}

