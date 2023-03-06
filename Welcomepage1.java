import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcomepage1 implements ActionListener{
    JFrame frame = new JFrame("The Millennium Casino");
    JLabel WelcomeLabel = new JLabel("Hello");
    Color c1 = new Color(255, 204, 51); 
    JButton LogoutButton = new JButton("Logout");

    //constructor

    Welcomepage1(String userID){

        WelcomeLabel.setBounds(0,0,350,35);
        WelcomeLabel.setFont(new Font(null,Font.BOLD,25));
        WelcomeLabel.setText("Hello " + userID + "! Ready to play?");
        WelcomeLabel.setBounds(40,40,350,30);
        WelcomeLabel.setForeground(c1);

        JLabel gameprompt = new JLabel("Pick a game");
        gameprompt.setFont(new Font(null, Font.PLAIN, 15));
        gameprompt.setForeground(Color.white);
        gameprompt.setBounds(60,100,100,30);

        JButton coinflipbtn = new JButton("Coin Flip");
        JButton blackjackbtn = new JButton("Black Jack");
        JButton roulettebtn = new JButton("Roulette");

        coinflipbtn.setBounds(250,100,100,30);
        coinflipbtn.setFocusable(false);
        coinflipbtn.setBackground(c1);
        coinflipbtn.setFont(new Font(null, Font.BOLD,12));

        blackjackbtn.setBounds(250,175,100,30);
        blackjackbtn.setFocusable(false);
        blackjackbtn.setBackground(c1);
        blackjackbtn.setFont(new Font(null, Font.BOLD,12));

        roulettebtn.setBounds(250,250,100,30);
        roulettebtn.setFocusable(false);
        roulettebtn.setBackground(c1);
        roulettebtn.setFont(new Font(null, Font.BOLD,12));

        LogoutButton.setBounds(35,350,100,25);
        LogoutButton.setFocusable(false);
        LogoutButton.addActionListener((java.awt.event.ActionListener) this);
        LogoutButton.setBackground(c1);
        LogoutButton.setFont(new Font(null, Font.BOLD,12));
          
        frame.add(WelcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.getContentPane().setBackground(Color.BLACK);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); 

        frame.add(gameprompt);
        frame.add(coinflipbtn);
        frame.add(blackjackbtn);
        frame.add(roulettebtn);
        frame.add(LogoutButton);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==LogoutButton) {
            frame.dispose();

            IDandPasswords1 idandPasswords = new IDandPasswords1();
            LoginPage1 login1 = new LoginPage1(idandPasswords.getLoginInfo());
            
        }
        
    }
    
}
