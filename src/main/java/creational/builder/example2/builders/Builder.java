package creational.builder.example2.builders;

import creational.builder.example2.cars.Type;
import creational.builder.example2.components.Engine;
import creational.builder.example2.components.GPSNavigator;
import creational.builder.example2.components.Transmission;
import creational.builder.example2.components.TripComputer;

public interface Builder {
  void setType(Type type);
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setTransmission(Transmission transmission);
  void setTripComputer(TripComputer tripComputer);
  void setGPSNavigator(GPSNavigator gpsNavigator);
}
