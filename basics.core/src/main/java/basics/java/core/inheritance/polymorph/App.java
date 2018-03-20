package basics.java.core.inheritance.polymorph;
// Child Class inheriting Tecaher Class

public class App extends Teacher {

  void Subject() {
    System.out.println("Math Subject");
  }

  void Mathmethod() {
    System.out.println("Math Class Method");
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Teacher t = new App();
    t.Subject();
    // t.Mathmethod();
    App ma = new App();
    ma.Mathmethod();

  }

}
