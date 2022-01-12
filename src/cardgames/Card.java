package cardgames;

public class Card {
    protected String value;
    protected String suit;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Card(String value, String suit) {
        this.suit = suit;
        this.value = value;
    }
}
