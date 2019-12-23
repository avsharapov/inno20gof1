package creational.builder.example2;

import creational.builder.example2.builders.Builder;
import creational.builder.example2.cars.Type;
import creational.builder.example2.components.Engine;
import creational.builder.example2.components.GPSNavigator;
import creational.builder.example2.components.Transmission;
import creational.builder.example2.components.TripComputer;

public class Director {
  public void constructSportsCar(Builder builder) {
    builder.setType(Type.SPORTS_CAR);
    builder.setSeats(2);
    builder.setEngine(new Engine(3.0, 0));
    builder.setTransmission(Transmission.SEMI_AUTOMATIC);
    builder.setTripComputer(new TripComputer());
    builder.setGPSNavigator(new GPSNavigator());
  }

  public void constructCityCar(Builder builder) {
    builder.setType(Type.CITY_CAR);
    builder.setSeats(2);
    builder.setEngine(new Engine(1.2, 0));
    builder.setTransmission(Transmission.AUTOMATIC);
    builder.setTripComputer(new TripComputer());
    builder.setGPSNavigator(new GPSNavigator());
  }

  public void constructSUV(Builder builder) {
    builder.setType(Type.SUV);
    builder.setSeats(4);
    builder.setEngine(new Engine(2.5, 0));
    builder.setTransmission(Transmission.MANUAL);
    builder.setGPSNavigator(new GPSNavigator());
  }
}
