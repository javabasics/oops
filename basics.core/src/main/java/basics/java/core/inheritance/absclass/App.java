package basics.java.core.inheritance.absclass;

public class App extends Car {

  @Override
  public void Break() {
    // TODO Auto-generated method stub
    System.out.println("Maruti Break");

  }

  @Override
  public void Seat() {

    // TODO Auto-generated method stub
    System.out.println("Maruti Seats");

  }

  @Override
  public void Color() {
    // TODO Auto-generated method stub
    System.out.println("Maruti Colors black red White");

  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    App obj = new App();
    obj.Break();
    obj.Seat();
    obj.Color();
    obj.Aircondition();
    Hyndai obj1 = new Hyndai();
    obj1.Break();
    obj1.Seat();
    obj1.Color();
    obj1.Aircondition();

  }

}
