package creational.abstractfactory.example4.visafactory;

import creational.abstractfactory.example4.CardType;
import creational.abstractfactory.example4.CreditCard;

public class VisaPlatinumCreditCard extends CreditCard {
  VisaPlatinumCreditCard() {
    this.type = CardType.PLATINUM;
  }
}
