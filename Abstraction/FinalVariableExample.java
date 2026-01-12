class BlankFinalExample {
  final int speed; // blank final

  BlankFinalExample(int s) {
    speed = s; // must assign value here
  }

  void showSpeed() {
    System.out.println("Speed: " + speed);
  }
  public static void main(String[] args) {
    BlankFinalExample obj = new BlankFinalExample(90);
  
    obj.showSpeed(); // Output: Speed: 90
  
  }
}