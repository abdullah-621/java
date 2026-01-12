class show {
  static int cnt = 0;

  show()
  {
    cnt++;
  }
}

public class objCount {
  public static void main(String[] args)
  {
    show s1 = new show();
    show s2 = new show();
    show s3 = new show();
    show s4 = new show();
    show s5 = new show();

    System.out.println(show.cnt);
  }
}
