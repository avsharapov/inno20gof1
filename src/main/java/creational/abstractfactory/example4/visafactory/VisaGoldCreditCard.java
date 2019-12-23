package creational.abstractfactory.example4.visafactory;

import creational.abstractfactory.example4.CardType;
import creational.abstractfactory.example4.CreditCard;

public class VisaGoldCreditCard extends CreditCard {
  VisaGoldCreditCard() {
    this.type = CardType.GOLD;
  }
}
