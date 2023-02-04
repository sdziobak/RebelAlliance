import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CoinControl extends JPanel {
    private Coin coin;
    private CoinPanel coinPanel;
    private JButton flipButton;


    public CoinControl (CoinPanel coinPanel, Coin coin){
        this.coinPanel= coinPanel;
        this.coin=coin;
        flipButton= new JButton("Flip Me");
        flipButton.setToolTipText("Flips the coin");
        flipButton.addActionListener(new ButtonListener());

        setBackground(Color.WHITE);
        add(flipButton);
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            coin.flip();
            coinPanel.repaint();
        }
    }




}
