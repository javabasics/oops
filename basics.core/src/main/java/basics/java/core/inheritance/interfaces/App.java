package basics.java.core.inheritance.interfaces;

public class App implements MobilePhone {

  public void Calling() {
    // TODO Auto-generated method stub
    System.out.println("Please use centre button for Calling");
  }

  public void SendSMS() {
    // TODO Auto-generated method stub
    System.out.println("Please use left for Sending SMS");
  }

  public void Mp3player() {
    System.out.println("VLC player is the default media player");
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    App red = new App();
    System.out.println("Calling from Redme Class" + red.name);
    red.Calling();
    red.SendSMS();
    red.Mp3player();
    Samsung sam = new Samsung();
    System.out.println("Calling from Samsung Class" + sam.name);
    sam.Calling();
    sam.SendSMS();
    sam.Camera();
  }

}
