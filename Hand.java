package hellofx;

import hellofx.Card.Rank;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableList;
import javafx.scene.Node;


public class Hand {

    private ObservableList<Node> cards;
    private SimpleIntegerProperty value = new SimpleIntegerProperty(0);

    private int aces = 0;

    public Hand(ObservableList<Node> cards) {
        this.cards = cards;
    }

    public void takeCard(Card card) {
        cards.add(card);

        if (card.rank == Rank.Ace) {
            aces++;
        }

        if (value.get() + card.value > 21 && aces > 0) {
            value.set(value.get() + card.value - 10);
            aces--;
        }
        else {
            value.set(value.get() + card.value);
        }
    }

    public void reset() {
        cards.clear();
        value.set(0);
        aces = 0;
    }

    public SimpleIntegerProperty valueProperty() {
        return value;
    }
}
