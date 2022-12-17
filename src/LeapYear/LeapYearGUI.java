package LeapYear;
import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        setTitle("Leap Year Checker");

        btnCheckYear.addActionListener((event) -> {
                try {
                    int year = Integer.parseInt(tfYear.getText());

                    //Formula
                    boolean isLeapYear = false;
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                isLeapYear = true;
                            }
                        } else {
                            isLeapYear = true;
                        }
                    }

                    String message = isLeapYear ? "Leap year" : "Not a leap year";
                    JOptionPane.showMessageDialog(null, message);

                }catch (NumberFormatException bout2) {
                        JOptionPane.showMessageDialog(null, "Please input a valid year.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

        });
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        LeapYearGUI disp = new LeapYearGUI();
        disp.setContentPane(new LeapYearGUI().panel1);
        disp.setSize(250, 300);
        disp.setVisible(true);
    }
}
