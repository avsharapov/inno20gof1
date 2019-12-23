package creational.abstractfactory.example1.teddyfactory;

import creational.abstractfactory.example1.Bear;

public class TeddyBear extends Bear {

    @Override
    protected String getName() {
        return "Teddy Bear";
    }
}
