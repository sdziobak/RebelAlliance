import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationPage implements ActionListener{

    JFrame frame = new JFrame();

    JLabel RegistrationLabel = new JLabel("Enter your information below to register.");
    JLabel UsernameLabel = new JLabel("userID:");
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

    RegistrationPage(){
       
       RegistrationLabel.setBounds(30,10,350,35);
       RegistrationLabel.setFont(new Font(null,Font.PLAIN,15));

       UsernameLabel.setBounds(30,40,200,45);
       PasswordLabel.setBounds(30, 90, 200, 45 );
       ConfirmPasswordLabel.setBounds(30, 140, 200, 45 );
       DOBLabel.setBounds(30, 195, 200, 45);

       UsernameField.setBounds(155, 50, 200, 25);
       PasswordField.setBounds(155, 100, 200, 25);
       ConfirmPasswordField.setBounds(155, 150, 200, 25);

       daysComboBox.setBounds(200, 210, 70, 20);
       monthsComboBox.setBounds(100, 210, 90, 20);
       yearsComboBox.setBounds(285, 210, 75, 20);

       RegisterButton.setBounds(120,250,100,25);
       RegisterButton.setFocusable(false);
       RegisterButton.addActionListener((java.awt.event.ActionListener) this);

       ResetButton.setBounds(220, 250, 100, 25);
       ResetButton.setFocusable(false);
       ResetButton.addActionListener((java.awt.event.ActionListener) this);

       BackButton.setBounds(35,330,100,25);
       BackButton.setFocusable(false);
       BackButton.addActionListener((java.awt.event.ActionListener) this);

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
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420,420);
       frame.setLayout(null);
       frame.setVisible(true);
    

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
            frame.dispose();
            LoginPage login1 = new LoginPage(null);
        }
    
        if(e.getSource()==BackButton) {
            frame.dispose();
            LoginPage login2 = new LoginPage(null);
        }
    }
}


/* TO DO:
>add register button that works and brings user back to login page
    >allows 18 and over to make an account and use that info to sign in and under 18 not allowed to make an account and pops up with a message
    >saves userID and password to let the user login again
    >confirms the password is the same in both fields
>validate user is over 18 and enters correct birthdate (can't enter feb. 31st ex.)
*/