import java.util.Scanner;

class book {
  String title;
  String author;

  book(String title, String author)
  {
    this.title = title;
    this.author = author;
  }

  void display()
  {
    System.out.println(title + " " + author);
  }
}


public class Array_of_Object {
  public static void main(String[] args) {

    book[] library = new book[3];

    // library[0] = new book("a", "b");
    // library[1] = new book("c", "d");
    // library[2] = new book("e", "f");

    Scanner var1 = new Scanner(System.in);

  for(int i = 0; i < library.length; i++)
  {
    System.out.print("Enter title name: ");
    String s = var1.nextLine();

    System.out.print("Enter author name: ");
    String s2 = var1.nextLine();


    library[i] = new book(s, s2);
  }
        

    for (int i = 0; i < library.length; i++) {
      library[i].display();
    }
  }
}
