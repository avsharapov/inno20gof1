package creational.abstractfactory.example4.amexfactory;

import creational.abstractfactory.example4.CardType;
import creational.abstractfactory.example4.CreditCard;
import creational.abstractfactory.example4.CreditCardFactory;
import creational.abstractfactory.example4.Validator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                return null;
        }

    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                return null;
        }
    }

}
