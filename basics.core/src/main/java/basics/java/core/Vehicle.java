package basics.java.core;

public interface Vehicle {

  public enum TransportMode {
    ROAD, RAIL, AIR, WATER
  }

  TransportMode getTransportMode();

}
