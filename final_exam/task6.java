final class PhysicsConstants {
  public static final double GRAVITY = 9.81;
  public static final double SPEED_OF_LIGHT = 299792458;

  final void showConstants() {
    System.out.println("GRAVITY : " + GRAVITY + "\nSPEED_OF_LIGHT : " + SPEED_OF_LIGHT);
  }
}
// class chamistry extends PhysicsConstants
// {

// }

public class task6 {
  public static void main(String[] args) {
    PhysicsConstants p = new PhysicsConstants();
    p.showConstants();
  }
}
