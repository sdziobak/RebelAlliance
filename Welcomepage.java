import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcomepage {

    JFrame frame = new JFrame();
    JLabel WelcomeLabel = new JLabel("Hello");

    //constructor

    Welcomepage(String userID){

        WelcomeLabel.setBounds(0,0,350,35);
        WelcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        WelcomeLabel.setText("Hello " + userID + "! Ready to play?");

        frame.add(WelcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    
}