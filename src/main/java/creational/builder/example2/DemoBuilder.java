package creational.builder.example2;

import creational.builder.example2.builders.CarBuilder;
import creational.builder.example2.builders.CarManualBuilder;
import creational.builder.example2.cars.Car;
import creational.builder.example2.cars.Manual;

public class DemoBuilder {
  public static void main(String[] args) {
    Director director = new Director();

    CarBuilder builder = new CarBuilder();
    director.constructSportsCar(builder);
    Car car = builder.getResult();
    System.out.println("Car built:\n" + car.getType());


    CarManualBuilder manualBuilder = new CarManualBuilder();
    director.constructSportsCar(manualBuilder);
    Manual carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());


    director.constructSUV(builder);
    car = builder.getResult();
    System.out.println("Car built:\n" + car.getType());

    director.constructSUV(manualBuilder);
    carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());
  }
}
