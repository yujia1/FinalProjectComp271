import javax.swing.*;
import java.awt.desktop.ScreenSleepEvent;

public class screen extends JFrame{
    private JPanel city;
    private JPanel categories;
    private JPanel contact;
    private JPanel operator;
    private JLabel cityname;
    private JLabel categoryname;
    private JLabel contactNum;
    private JPanel search;
    private JPanel add;
    private JPanel remove;
    private JButton searchButton;
    private JButton addButton;
    private JButton removeButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton newYorkButton;
    private JButton chicagoButton;
    private JButton LAButton;
    private JButton bostonButton;
    private JButton restaurantButton;
    private JButton schoolButton;
    private JButton companyButton;
    private JButton emergencyButton;
    private JPanel panelMain;
    private JList list1;

    screen(){
        super("Phone Book");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        screen screen = new screen();
        screen.setVisible(true);
    }
}
