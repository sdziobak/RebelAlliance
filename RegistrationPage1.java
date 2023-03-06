import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.util.HashMap;

import static java.time.temporal.ChronoField.YEAR;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.DAY_OF_MONTH;

public class RegistrationPage1 implements ActionListener{

    Color c1 = new Color(255, 204, 51); 

    JFrame frame = new JFrame("The Millennium Casino");

    JLabel RegistrationLabel = new JLabel("Enter your information below to register.");
    JLabel UsernameLabel = new JLabel("User ID:");
    JLabel PasswordLabel = new JLabel("Password:");
    JLabel ConfirmPasswordLabel = new JLabel("Confirm password:");

    JLabel DOBLabel = new JLabel("DOB:");

    String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26",
         "27","28","29","30","31"};
    String years[] = {"2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997",
         "1996","1995","1994","1993","1992","1991","1990","1989","1988","1987","1986","1985","1984","1983","1982","1981","1980","1979","1978",
         "1977","1976","1975","1974","1973","1972","1971","1970","1969","1968","1967","1966","1965","1964","1963","1962","1961","1960","1959",
         "1958","1957","1956","1955","1954","1953","1952","1951","1950"};
    JComboBox daysComboBox = new JComboBox<>(days);
    JComboBox monthsComboBox = new JComboBox<>(months);
    JComboBox yearsComboBox = new JComboBox<>(years);

    JTextField UsernameField = new JTextField();
    JPasswordField PasswordField = new JPasswordField();
    JPasswordField ConfirmPasswordField = new JPasswordField();

    JButton RegisterButton = new JButton("Register");
    JButton BackButton = new JButton("Back");
    JButton ResetButton = new JButton("Reset");

    RegistrationPage1(){
       
       RegistrationLabel.setBounds(30,10,350,35);
       RegistrationLabel.setFont(new Font(null,Font.BOLD,15));
       RegistrationLabel.setForeground(Color.WHITE);

       UsernameLabel.setBounds(30,40,200,45);
       UsernameLabel.setFont(new Font(null, Font.BOLD, 15));
       UsernameLabel.setForeground(Color.WHITE);

       PasswordLabel.setBounds(30, 90, 200, 45 );
       PasswordLabel.setFont(new Font(null, Font.BOLD, 15));
       PasswordLabel.setForeground(Color.WHITE);

       ConfirmPasswordLabel.setBounds(30, 140, 200, 45 );
       ConfirmPasswordLabel.setFont(new Font(null, Font.BOLD, 15));
       ConfirmPasswordLabel.setForeground(Color.WHITE);

       DOBLabel.setBounds(30, 195, 200, 45);
       DOBLabel.setFont(new Font(null, Font.BOLD, 15));
       DOBLabel.setForeground(Color.WHITE);

       UsernameField.setBounds(180, 50, 200, 25);
       PasswordField.setBounds(180, 100, 200, 25);
       ConfirmPasswordField.setBounds(180, 150, 200, 25);

       daysComboBox.setBounds(225, 210, 70, 20);
       monthsComboBox.setBounds(125, 210, 90, 20);
       yearsComboBox.setBounds(305, 210, 75, 20);

       RegisterButton.setBounds(120,250,100,25);
       RegisterButton.setFocusable(false);
       RegisterButton.addActionListener((java.awt.event.ActionListener) this);
       RegisterButton.setBackground(c1);
       RegisterButton.setFont(new Font(null, Font.BOLD,12));
       RegisterButton.setForeground(Color.BLACK);


       ResetButton.setBounds(230, 250, 100, 25);
       ResetButton.setFocusable(false);
       ResetButton.addActionListener((java.awt.event.ActionListener) this);
       ResetButton.setBackground(c1);
       ResetButton.setFont(new Font(null, Font.BOLD,12));
       ResetButton.setForeground(Color.BLACK);

       BackButton.setBounds(35,350,100,25);
       BackButton.setFocusable(false);
       BackButton.addActionListener((java.awt.event.ActionListener) this);
       BackButton.setBackground(c1);
       BackButton.setFont(new Font(null, Font.BOLD,12));
       BackButton.setForeground(Color.BLACK);

       frame.add(RegistrationLabel);
       frame.add(UsernameLabel);
       frame.add(PasswordLabel);
       frame.add(ConfirmPasswordLabel);
       frame.add(DOBLabel);
       frame.add(UsernameField);
       frame.add(PasswordField);
       frame.add(ConfirmPasswordField);
       frame.add(daysComboBox);
       frame.add(monthsComboBox);
       frame.add(yearsComboBox);
       frame.add(RegisterButton);
       frame.add(BackButton);
       frame.add(ResetButton);

       frame.setBackground(Color.ORANGE);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(450,450);
       frame.setLayout(null);
       frame.setVisible(true);
       frame.getContentPane().setBackground(Color.BLACK);
       //makes the window appear in the center
       frame.setLocationRelativeTo(null); 

    }

public void actionPerformed (ActionEvent e) {

        if(e.getSource()==ResetButton){
            UsernameField.setText("");
            PasswordField.setText("");
            ConfirmPasswordField.setText("");
            daysComboBox.setSelectedItem("1");
            monthsComboBox.setSelectedItem("January");
            yearsComboBox.setSelectedItem("2013");
        }

        if(e.getSource()==RegisterButton){
            LocalDate currentDate = LocalDate.now();

            int year = Integer.parseInt((String) yearsComboBox.getSelectedItem());

            LocalDate dob = LocalDate.of(year, (monthsComboBox.getSelectedIndex()) + 1, (daysComboBox.getSelectedIndex()) + 1);

            //check date
            System.out.println(dob);

            try {
                if ((dob != null)  && (currentDate != null) && (validDate() == true)) {
                Period period = Period.between(dob, currentDate);
                if (period.getYears() < 18) {
                    //message box saying youre not old enough
                    JFrame f1 = new JFrame();
                    JOptionPane.showMessageDialog(f1,"Sorry you are not old enough to play.","Alert",JOptionPane.WARNING_MESSAGE);

                } else {
                    String password = PasswordField.getText();
                    String confirmpassword = ConfirmPasswordField.getText();
                    String username = UsernameField.getText();

                    if (password.equals(confirmpassword) && (username.isEmpty() == false || password.isEmpty() == false || confirmpassword.isEmpty() == false)) {
                        //store dob and age

                        frame.dispose();
                        IDandPasswords1 idandPasswords = new IDandPasswords1();
                        LoginPage1 login1 = new LoginPage1(idandPasswords.getLoginInfo());
                        
                    } else if (password.equals(confirmpassword) == false) {
                        JFrame f2 = new JFrame();
                        JOptionPane.showMessageDialog(f2,"The password you entered doesn't match in both fields.","Alert",JOptionPane.WARNING_MESSAGE);
                    
                    } else if (username.isEmpty() == true || password.isEmpty() == true || confirmpassword.isEmpty() == true) {
                        JFrame f3 = new JFrame();
                        JOptionPane.showMessageDialog(f3,"One or more fields were left blank.","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }        
            
            } catch (Exception e1) {
                        e1.printStackTrace();
                        JFrame f4 = new JFrame();
                        JOptionPane.showMessageDialog(f4,"Sorry you did not enter a valid date.","Alert",JOptionPane.WARNING_MESSAGE);
                    } 
        }            

        if(e.getSource()==BackButton) {
            frame.dispose();

            IDandPasswords1 idandPasswords = new IDandPasswords1();
            LoginPage1 login1 = new LoginPage1(idandPasswords.getLoginInfo());
            
        }
    }

//this doesn't work yet
    public boolean validDate() {
        int year = Integer.parseInt((String) yearsComboBox.getSelectedItem());
        int month = monthsComboBox.getSelectedIndex() + 1;
        int day = daysComboBox.getSelectedIndex() + 1;

       //checking if user entered a valid date for february
        if (month == 2) {
            //check if leap year
            if ((year % 4) == 0) {
                //validate date if leap year
                if (day <= 29) {
                    return true;
                } else {
                    return false;
                }
            //validate date if not leap year
            } else {
                if (day <= 28) {
                    return true;
                } else {
                    return false;
                }
            }
            
        //checking if user entered a valid date for april, june, september, and november
        } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            if (day <= 30 ) {
                return true;
            } else {
                return false;
            }
        
        } else {
            return true;
        }
    }
}

/*  TO DO:
 *  >FIX VALID DATE
 *  >STORE USER ID AND PASSWORD
 *  >ALERT USER IF USER ID IS ALREADY TAKEN
 */
