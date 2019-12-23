package creational.abstractfactory.example3.samsungfactory;

import creational.abstractfactory.example3.Laptop;
import creational.abstractfactory.example3.Phone;
import creational.abstractfactory.example3.TechFactory;

public class SamsungFactory implements TechFactory {

    @Override
    public Laptop getLaptop() {
        return new SamsungLaptop();
    }

    @Override
    public Phone getPhone() {
        return new GalaxyS();
    }

}
