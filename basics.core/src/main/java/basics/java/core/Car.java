package basics.java.core;

public interface Car {

  public enum Model {
    MARUTI, HYUNDAI, TATA
  }

  public enum Color {
    WHITE, BLACK, RED
  }

  public enum FuelType {
    PETROL, DIESEL
  }

  Model getModel();

  Color getColor();

  long getNoOfGears();

  FuelType getFuelType();
}
