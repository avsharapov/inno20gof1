package creational.abstractfactory.example4.amexfactory;

import creational.abstractfactory.example4.CreditCard;
import creational.abstractfactory.example4.Validator;

public class AmexGoldValidator implements Validator {
  @Override
  public boolean isValid(CreditCard creditCard) {
    return creditCard instanceof AmexGoldCreditCard;
  }
}
