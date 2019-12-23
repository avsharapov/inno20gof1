package creational.abstractfactory.example2.factory2;

import creational.abstractfactory.example2.AbstractFactory;
import creational.abstractfactory.example2.ProductA;
import creational.abstractfactory.example2.ProductB;
import creational.abstractfactory.example2.ProductC;

public class Factory2 implements AbstractFactory {

    @Override
    public ProductA getProductA() {
        return new ProductAF2();
    }

    @Override
    public ProductB getProductB() {
        return new ProductBF2();
    }

    @Override
    public ProductC getProductC() {
        return new ProductCF2();
    }

}
