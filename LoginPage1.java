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

public class LoginPage1 implements ActionListener{
    Color c1 = new Color(255, 204, 51); 

    //setting up environment with labels and buttons
    JFrame frame = new JFrame("The Millennium Casino");
    //creating and naming the buttons
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
  
    //create a text field where the user will type in
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();

    //adding a "Welcome to the casino JLabel"
    JLabel welcomemsg = new JLabel("Welcome to the Millennium Casino!");

    //adding a label 
    JLabel userIDLabel = new JLabel("User ID:");
    JLabel userPasswordLabel = new JLabel("Password:");

    //shows if login was successful or not
    JLabel messageLabel = new JLabel("");

    //add register button
    JButton registerButton = new JButton("Register");

    //add register label
    JLabel registerLabel = new JLabel("Don't have an account? Register now.");

    HashMap<String,String> logininfo = new HashMap<String,String>();

    //constructor for login page
    LoginPage1(HashMap<String,String> loginInfoOriginal){

        logininfo = loginInfoOriginal;
        //setting bounds for the labels, text fields and buttons
        //adding fonts and colors
        
        userIDLabel.setBounds(75,135,75,25);
        userIDLabel.setFont(new Font(null, Font.BOLD,15));
        userIDLabel.setForeground(Color.WHITE);

        userPasswordLabel.setBounds(75,180,125,25);
        userPasswordLabel.setFont(new Font(null, Font.BOLD,15));
        userPasswordLabel.setForeground(Color.WHITE);

        messageLabel.setBounds(125,230,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,18));

        registerLabel.setBounds(120, 315, 300, 25);
        registerLabel.setForeground(Color.WHITE);

        userIDField.setBounds(180,135,150,25);
        userPasswordField.setBounds(180,180,150,25);

        loginButton.setBounds(120,270,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        loginButton.setBackground(c1);
        loginButton.setFont(new Font(null, Font.BOLD,12));
        loginButton.setForeground(Color.BLACK);

        resetButton.setBounds(230,270,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener((java.awt.event.ActionListener) this);
        resetButton.setBackground(c1);
        resetButton.setFont(new Font(null, Font.BOLD,12));
        resetButton.setForeground(Color.BLACK);

        registerButton.setBounds(175, 345, 100, 25);
        registerButton.setFocusable(false);
        registerButton.addActionListener((java.awt.event.ActionListener) this);
        registerButton.setBackground(c1);
        registerButton.setFont(new Font(null, Font.BOLD, 12));
        registerButton.setForeground(Color.BLACK);
        
        welcomemsg.setBounds(40, 40, 350,30);
        welcomemsg.setFont(new Font(null, Font.ITALIC | Font.BOLD,20));
        Color c1 = new Color(255, 204, 51);  
        welcomemsg.setForeground(c1);
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(welcomemsg);
        frame.add(registerLabel);

        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(registerButton);

        frame.setBackground(Color.ORANGE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(450,450);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
        //makes the window appear in the center
        frame.setLocationRelativeTo(null); 
    
    }


    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
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
                    Welcomepage1 welcomePage = new Welcomepage1(userID);
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password");
                }
           }
           else {
            messageLabel.setForeground(Color.red);
            messageLabel.setText("Username Not Found!");
           }
        }
        
        if(e.getSource()==registerButton) {
            frame.dispose();
            RegistrationPage1 registrationpage = new RegistrationPage1();
            
        
        }
    }
}
