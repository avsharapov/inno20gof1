package creational.abstractfactory.example4.visafactory;

import creational.abstractfactory.example4.CreditCard;
import creational.abstractfactory.example4.Validator;

public class VisaGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return creditCard instanceof VisaGoldCreditCard;
    }
}
