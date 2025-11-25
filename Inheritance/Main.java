// object parameter

class box {
  int height;
  int widht;
  int depth;

  box()
  {
    height = 1;
    widht = 1;
    depth = 1;
  }

  box(int height, int widht, int depth)
  {
    this.height = height;
    this.widht = widht;
    this.depth = depth;
  }


  boolean isEqual(box b)
  {
    return (this.height == b.height && this.widht == b.widht && this.depth == b.depth);
  }


}
public class Main {
  public static void main(String[] args) {
    box b1 = new box(1, 2, 3);
    box b2 = new box(1, 2, 3);
    box b3 = new box(1, 2, 4);

    System.out.println(b1.isEqual(b2));
    System.out.println(b2.isEqual(b3));
    System.out.println(b3.isEqual(b1));
  }
}
