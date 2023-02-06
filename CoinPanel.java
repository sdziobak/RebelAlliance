import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;





public class CoinPanel extends JPanel {
    private Coin coin;
    private ImageIcon headsIcon, tailsIcon;
    private JLabel imgLabel;

    public CoinPanel(Coin coin){
        this.coin=coin;
        headsIcon= new ImageIcon("C:\\Users\\sarah\\OneDrive\\Desktop\\PracticeCoin\\Coin\\bin\\coins\\2019-america-the-beautiful-quarters-W-CourtesyUSMint.jpg");
        tailsIcon= new ImageIcon("C:\\Users\\sarah\\OneDrive\\Desktop\\PracticeCoin\\Coin\\bin\\coins\\download.jfif");
        imgLabel=new JLabel("Coin Game", headsIcon, SwingConstants.CENTER);
        imgLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        imgLabel.setVerticalTextPosition(SwingConstants.CENTER);
        imgLabel.setVerticalTextPosition(SwingConstants.TOP);
        add(imgLabel);
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(400,400));

    }

    public void repaint(){
        if (coin!=null){
            System.out.println("Coin: " + coin);
        
        if (coin.getFace().equals("Heads")){
            imgLabel.setIcon(headsIcon);
        }
        if(coin.getFace().equals("Tails")){
            imgLabel.setIcon(tailsIcon);
        }
        super.repaint();
    }
}
}

