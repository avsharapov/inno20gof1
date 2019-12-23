package creational.abstractfactory.example4.amexfactory;

import creational.abstractfactory.example4.CardType;
import creational.abstractfactory.example4.CreditCard;

class AmexGoldCreditCard extends CreditCard {
  AmexGoldCreditCard() {
    this.type = CardType.GOLD;
  }
}
