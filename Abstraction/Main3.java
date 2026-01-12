interface Drawable {
  
  int size = 10;

  void draw();
}

class squre implements Drawable {
  public void draw()
  {
    System.out.println(size);
  }
}

public class Main3 {
  public static void main(String[] args) {
    Drawable d = new squre();
    squre s = new squre();
    d.draw();
    System.out.println(d.size);
    System.out.println(s.size);
  }
}
