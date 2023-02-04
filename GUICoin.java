import java.awt.*;
import javax.swing.*;

public class GUICoin {
    public static void main (String [] args){
        JFrame frame=new JFrame("Coin Flip Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Coin coins= new Coin();

        CoinPanel coinPanel= new CoinPanel(coins);
        CoinControl controls= new CoinControl(coinPanel, coins);

        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        panel.add(coinPanel);
        panel.add(controls);



        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    
    }
}
