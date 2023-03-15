package hellofx;

import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Card extends Parent {

    enum Suit {
        Hearts, Diamonds, Clubs, Spades
    };

    enum Rank {
        Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(10), Queen(10), King(10), Ace(11);

        final int value;
        private Rank(int value) {
            this. value = value;
        }
    };

    private final Suit suit;
    final Rank rank;
    final int value;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.value = rank.value;

        Rectangle bg = new Rectangle(80, 100);
        bg.setArcWidth(20);
        bg.setArcHeight(20);
        bg.setFill(Color.AZURE);

        Text text = new Text(toString());
        text.setWrappingWidth(70);

        getChildren().add(new StackPane(bg, text));
    }

    @Override
    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }
    
}

