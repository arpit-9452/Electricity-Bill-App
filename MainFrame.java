import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
    MainFrame() {
        Font font = new Font("Roboto", Font.BOLD, 30);
        Font newfont = new Font("Roboto", Font.BOLD, 26);
        Font regularfont = new Font("Sans-seriff", Font.BOLD, 22);

        // Bill Panel=======================================
        JLabel bilLabel = new JLabel();
        bilLabel.setText("Welcome to Bill Area");
        bilLabel.setLayout(null);
        bilLabel.setFont(newfont);
        bilLabel.setForeground(Color.BLACK);
        bilLabel.setBounds(100, 20, 280, 35);

        JTextArea billField = new JTextArea();
        billField.setLayout(null);
        billField.setFont(regularfont);
        billField.setBounds(10, 80, 430, 420);

        JPanel bilPanel = new JPanel();
        bilPanel.setLayout(null);
        bilPanel.setBackground(Color.LIGHT_GRAY);
        bilPanel.setBounds(610, 80, 450, 515);
        bilPanel.add(bilLabel);
        bilPanel.add(billField);
        // Bill Panel=======================================

        // Customer Details Panel=========================================
        JLabel cName = new JLabel();
        cName.setText("Enter Customer Name");
        cName.setLayout(null);
        cName.setFont(newfont);
        cName.setForeground(Color.BLACK);
        cName.setBounds(5, 30, 280, 30);

        JLabel cLastName = new JLabel();
        cLastName.setText("Enter Last Name");
        cLastName.setLayout(null);
        cLastName.setFont(newfont);
        cLastName.setForeground(Color.BLACK);
        cLastName.setBounds(5, 100, 320, 30);

        JLabel cMobilNumber = new JLabel();
        cMobilNumber.setText("Enter Mobile Number");
        cMobilNumber.setLayout(null);
        cMobilNumber.setFont(newfont);
        cMobilNumber.setForeground(Color.BLACK);
        cMobilNumber.setBounds(5, 160, 320, 30);

        JLabel cBill = new JLabel();
        cBill.setText("Customer Bill");
        cBill.setLayout(null);
        cBill.setFont(newfont);
        cBill.setForeground(Color.BLACK);
        cBill.setBounds(5, 220, 380, 30);

        JLabel meterId = new JLabel();
        meterId.setText("Meter Id");
        meterId.setLayout(null);
        meterId.setFont(newfont);
        meterId.setForeground(Color.BLACK);
        meterId.setBounds(5, 290, 380, 30);

        JLabel billPrice = new JLabel();
        billPrice.setText("Bill Price");
        billPrice.setLayout(null);
        billPrice.setFont(newfont);
        billPrice.setForeground(Color.BLACK);
        billPrice.setBounds(5, 360, 380, 30);

        JTextArea cNameTextArea = new JTextArea();
        cNameTextArea.setLayout(null);
        cNameTextArea.setBounds(330, 30, 220, 40);
        cNameTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        cNameTextArea.setFont(newfont);

        JTextArea cLastTextArea = new JTextArea();
        cLastTextArea.setLayout(null);
        cLastTextArea.setBounds(330, 100, 220, 40);
        cLastTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        cLastTextArea.setFont(newfont);

        JTextArea cMobileNumberTextArea = new JTextArea();
        cMobileNumberTextArea.setLayout(null);
        cMobileNumberTextArea.setBounds(330, 160, 220, 40);
        cMobileNumberTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        cMobileNumberTextArea.setFont(newfont);

        JTextArea cBillTextArea = new JTextArea();
        cBillTextArea.setLayout(null);
        cBillTextArea.setBounds(330, 220, 220, 40);
        cBillTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        cBillTextArea.setFont(newfont);

        JTextArea meterIdTextArea = new JTextArea();
        meterIdTextArea.setLayout(null);
        meterIdTextArea.setBounds(330, 290, 220, 40);
        meterIdTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        meterIdTextArea.setFont(newfont);

        JTextArea billPriceTextArea = new JTextArea();
        billPriceTextArea.setLayout(null);
        billPriceTextArea.setBounds(330, 360, 220, 40);
        billPriceTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        billPriceTextArea.setFont(newfont);

        // Generate Bill Button
        JButton billButton = new JButton();
        billButton.setText("Generate Bill");
        billButton.setLayout(null);
        billButton.setBackground(Color.BLACK);
        billButton.setForeground(Color.RED);
        billButton.setBounds(60, 440, 220, 60);
        billButton.setFont(regularfont);

        billButton.addActionListener((e) -> {
            System.out.println("This Button is Clicked..");

            String cNameStr = cNameTextArea.getText();
            double nameLen = cNameStr.length();

            String cLastNameStr = cLastTextArea.getText();
            double clastNameLen = cLastNameStr.length();

            String cMobileNumberStr = cMobileNumberTextArea.getText();

            double customerBillUnit = nameLen * clastNameLen * 5;
            String customerBillStr = Double.toString(customerBillUnit);
            cBillTextArea.setText(customerBillStr + " Unit Use");

            double meterIdNumber = nameLen * clastNameLen;
            String meterIdStr = Double.toString(meterIdNumber);
            meterIdTextArea.setText(meterIdStr);

            double meterBillPrice = customerBillUnit * 11;
            String meterBillPriceStr = Double.toString(meterBillPrice);
            billPriceTextArea.setText(meterBillPriceStr);

            billField.setText("\n" + "  Customer Name = " + " " + cNameStr + " " + cLastNameStr + "\n" + "\n" +
                    "  Customer Number = " + " " + cMobileNumberStr + "\n" + "\n" +
                    "  Customer Bill Units = " + " " + customerBillStr + "\n" + "\n" +
                    "  Customer Meter Id = " + " " + meterIdStr + "\n" + "\n" +
                    "  Customer Total Bill Price = " + " " + meterBillPriceStr + "\n" + "\n" +
                    "                   Thank you For Visit...");

        });

        // Generate Bill Button

        // Clear Button
        JButton clearButton = new JButton();
        clearButton.setText("Clear");
        clearButton.setLayout(null);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.RED);
        clearButton.setBounds(350, 440, 180, 60);
        clearButton.setFont(regularfont);

        clearButton.addActionListener((e) -> {
            cNameTextArea.setText("");
            cLastTextArea.setText("");
            cMobileNumberTextArea.setText("");
            cBillTextArea.setText("");
            meterIdTextArea.setText("");
            billPriceTextArea.setText("");
            billField.setText("");
        });

        // Clear Button

        JPanel customerDetailPanel = new JPanel();
        customerDetailPanel.setLayout(null);
        customerDetailPanel.setBackground(Color.DARK_GRAY);
        customerDetailPanel.setBounds(10, 80, 580, 515);
        customerDetailPanel.add(cName);
        customerDetailPanel.add(cLastName);
        customerDetailPanel.add(cMobilNumber);
        customerDetailPanel.add(cBill);
        customerDetailPanel.add(meterId);
        customerDetailPanel.add(billPrice);
        customerDetailPanel.add(cNameTextArea);
        customerDetailPanel.add(cLastTextArea);
        customerDetailPanel.add(cMobileNumberTextArea);
        customerDetailPanel.add(cBillTextArea);
        customerDetailPanel.add(meterIdTextArea);
        customerDetailPanel.add(billPriceTextArea);
        customerDetailPanel.add(billButton);
        customerDetailPanel.add(clearButton);
        // Customer Details Panel=========================================

        // NavBar Panel=========================================================
        JLabel textForNav = new JLabel();
        textForNav.setText("Electricity Bill");
        textForNav.setForeground(Color.WHITE);
        textForNav.setFont(font);
        textForNav.setBounds(400, 9, 380, 35);

        JPanel navPanel = new JPanel();
        navPanel.setLayout(null);
        navPanel.setBounds(0, 0, 1090, 60);
        navPanel.setBackground(Color.BLUE);
        navPanel.add(textForNav);
        // NavBar Panel=========================================================

        this.setSize(1100, 650);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.GRAY);
        this.add(navPanel);
        this.add(customerDetailPanel);
        this.add(bilPanel);
        this.setVisible(true);
    }

}