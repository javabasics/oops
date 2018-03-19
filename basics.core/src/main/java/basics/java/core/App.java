package basics.java.core;

import basics.java.core.Car.Color;
import basics.java.core.Car.FuelType;
import basics.java.core.Car.Model;
import basics.java.core.Vehicle.TransportMode;

public class App {
  public static void main(String[] args) {
    Car hyundai =
        new CarImpl(TransportMode.ROAD, Model.HYUNDAI, 1200L, 4L, Color.WHITE, FuelType.PETROL);
    Vehicle maruti =
        new CarImpl(TransportMode.ROAD, Model.MARUTI, 1100L, 5L, Color.RED, FuelType.DIESEL);

    System.out.println(hyundai.getModel() + "" + hyundai.getFuelType() + hyundai.getColor()
        + hyundai.getNoOfGears());

    for (int speed : CarImpl.getSpeedoMeterValues()) {
      System.out.println(speed);
    }

    System.out.println(maruti.getTransportMode());

    /*
     * Following methods are not visible if maruti is a vehicle... maruti.getModel();
     * maruti.getFuelType(); maruti.getColor();     maruti.getNoOfGears();
     */
  }
}
