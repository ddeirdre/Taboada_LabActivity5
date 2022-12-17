package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI() {

        setTitle("Food Ordering System");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbNone);
        bg.add(rb5);
        bg.add(rb10);
        bg.add(rb15);
            btnOrder.addActionListener((event) -> {
                try {
                double price = 0.0;
                if (cPizza.isSelected()) price += 100;
                if (cBurger.isSelected()) price += 80;
                if (cFries.isSelected()) price += 65;
                if (cSoftDrinks.isSelected()) price += 55;
                if (cTea.isSelected()) price += 50;
                if (cSundae.isSelected()) price += 40;
                if (rb5.isSelected()) price -= price * 0.05;
                else if (rb10.isSelected()) price -= price * 0.10;
                else if (rb15.isSelected()) price -= price * 0.15;
                    if (price==0) {
                        throw new IllegalArgumentException();
                    }

                JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", price));
                }catch (IllegalArgumentException mugna){
                    JOptionPane.showMessageDialog(FoodOrderGUI.this, "Please pick an order.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                });
                    setLocationRelativeTo(null);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
    public static void main(String[] args) {
        FoodOrderGUI dsp = new FoodOrderGUI();
        dsp.setContentPane(new FoodOrderGUI().panel1);
        dsp.setSize(600, 500);
        dsp.setVisible(true);
    }
}
