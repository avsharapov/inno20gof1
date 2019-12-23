package creational.abstractfactory.example4.visafactory;

import creational.abstractfactory.example4.CardType;
import creational.abstractfactory.example4.CreditCard;
import creational.abstractfactory.example4.CreditCardFactory;
import creational.abstractfactory.example4.Validator;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaPlatinumValidator();
        }
        return null;
    }
}
