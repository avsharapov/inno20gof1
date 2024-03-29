package creational.abstractfactory.example4;

import creational.abstractfactory.example4.amexfactory.AmexFactory;
import creational.abstractfactory.example4.visafactory.VisaFactory;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
