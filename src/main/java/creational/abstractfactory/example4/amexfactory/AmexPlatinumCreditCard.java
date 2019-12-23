package creational.abstractfactory.example4.amexfactory;

import creational.abstractfactory.example4.CardType;
import creational.abstractfactory.example4.CreditCard;

class AmexPlatinumCreditCard extends CreditCard {
  AmexPlatinumCreditCard() {
    this.type = CardType.PLATINUM;
  }
}
