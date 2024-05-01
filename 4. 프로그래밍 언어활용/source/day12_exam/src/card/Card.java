package card;

public class Card {
    private int cardNumber;
    private static int seriaNum = 10000;

    Card() {
        seriaNum++;
        cardNumber = seriaNum;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
