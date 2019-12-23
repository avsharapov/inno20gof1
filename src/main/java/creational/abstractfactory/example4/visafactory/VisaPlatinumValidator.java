package creational.abstractfactory.example4.visafactory;

import creational.abstractfactory.example4.CreditCard;
import creational.abstractfactory.example4.Validator;

public class VisaPlatinumValidator implements Validator {
  @Override
  public boolean isValid(CreditCard creditCard) {
    return creditCard instanceof VisaPlatinumCreditCard;
  }
}
