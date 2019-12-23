package creational.abstractfactory.example4;

// AbstractProduct
public abstract class CreditCard {
    private int cardNumberLength;
    private int cscNumber;
    protected CardType type;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }

    public CardType getType() {
        return type;
    }
}
