package basics.java.core;

import java.util.stream.IntStream;

public class CarImpl implements Car, Vehicle {

  private static int[] speedometerEntries;
  static {
    speedometerEntries = IntStream.range(1, 100).toArray();
  }

  private TransportMode transportMode;
  private Model model;
  private long capacity;
  private long gears;
  private Color color;
  private FuelType fuelType;

  public CarImpl(TransportMode transportMode, Model model, long capacity, long gears, Color color,
      FuelType fuelType) {
    this.transportMode = transportMode;
    this.model = model;
    this.capacity = capacity;
    this.gears = gears;
    this.color = color;
    this.fuelType = fuelType;
  }

  public TransportMode getTransportMode() {
    return transportMode;
  }

  public Model getModel() {
    return model;
  }

  public long getCapacity() {
    return capacity;
  }

  public long getNoOfGears() {
    return gears;
  }

  public Color getColor() {
    return color;
  }

  public FuelType getFuelType() {
    return fuelType;
  }

  public static int[] getSpeedoMeterValues() {
    return speedometerEntries;
  }

}
