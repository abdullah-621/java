class complex {
  int real;
  int img;

  complex() {
    real = 0;
    img = 0;
  }

  complex(int real, int img) {
    this.real = real;
    this.img = img;
  }

  complex add(complex c) {  // Method function
    complex res = new complex();

    res.real = this.real + c.real;
    res.img = this.img + c.img;

    return res;
  }

  void print() {
    System.out.println(real + " + " + img + "i");
  }
}

public class com_img{

  public static void main(String[] args)
  {
    complex c1 = new complex(2, 2);
    complex c2 = new complex(2, 3);

    complex c3 = c1.add(c2);

    c3.print();
  }
}


