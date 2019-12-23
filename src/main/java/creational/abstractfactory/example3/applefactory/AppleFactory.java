package creational.abstractfactory.example3.applefactory;

import creational.abstractfactory.example3.Laptop;
import creational.abstractfactory.example3.Phone;
import creational.abstractfactory.example3.TechFactory;

public class AppleFactory implements TechFactory {

    @Override
    public Laptop getLaptop() {
        return new MacBookPro();
    }

    @Override
    public Phone getPhone() {
        return new Iphone();
    }

}
