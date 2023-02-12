import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
    //setting up environment with labels and buttons
    JFrame frame = new JFrame();
    //creating and naming the buttons
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");

    //create a text field 
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();

    //adding a label 
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password:");

    //shows if login was successful or not
    JLabel messageLabel = new JLabel("");

    //add register button
    JButton registerButton = new JButton("Register");

    //add register label
    JLabel registerLabel = new JLabel("Don't have an account? Register now.");

    //add title label
    JLabel titleLabel1 = new JLabel("Welcome to the Millennium Casino!");
    JLabel titleLabel2 = new JLabel("Please log in.");

    HashMap<String,String> logininfo = new HashMap<String,String>();
    //constructor for login page
    LoginPage(HashMap<String,String> loginInfoOriginal){

        logininfo = loginInfoOriginal;

        //setting bounds for the labels, text fields and buttons
        userIDLabel.setBounds(50,60,75,25);
        userPasswordLabel.setBounds(50,110,75,25);
        registerLabel.setBounds(95, 260, 300, 25);
        titleLabel1.setBounds(50, 5, 350, 45);
        titleLabel1.setFont(new Font(null, Font.BOLD, 15));
        titleLabel2.setBounds(50, 25, 350, 45);
        titleLabel2.setFont(new Font(null, Font.BOLD, 15));

        messageLabel.setBounds(125,215,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        userIDField.setBounds(125,60,200,25);
        userPasswordField.setBounds(125,110,200,25);

        loginButton.setBounds(100,165,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener((java.awt.event.ActionListener) this);

        resetButton.setBounds(200,165,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener((java.awt.event.ActionListener) this);
        
        registerButton.setBounds(150, 290, 100, 25);
        registerButton.setFocusable(false);
        registerButton.addActionListener((java.awt.event.ActionListener) this);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(registerLabel);
        frame.add(titleLabel1);
        frame.add(titleLabel2);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(registerButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    
    }



    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        //if statements that when a user types
        //something and clicks the reset button the text dissappears
        if(e.getSource()==resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource()==loginButton){

            String userID = userIDField.getText();
            String password = String.copyValueOf(userPasswordField.getPassword());

            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(password)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful");
                    //get rid of the frame after typung in user name and password
                    //corrrectly
                    frame.dispose();
                    //new instance of the welcome page
                    Welcomepage welcomePage = new Welcomepage(userID);
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password");
                }
           }
           else {
            messageLabel.setForeground(Color.red);
            messageLabel.setText("Username Not Found");
           }
        }

        if(e.getSource()==registerButton) {
            frame.dispose();
            RegistrationPage registrationpage = new RegistrationPage();
            
        
        }

    }

    
}