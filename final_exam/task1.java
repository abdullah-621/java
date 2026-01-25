class Book {
  private String title;
  private String author;
  private int yearPublished;

  Book() {
    this.title = "Unknown title";
    this.author = "Unknown title";
    this.yearPublished = 0;
  }

  Book(String t, String a, int y) {
    this.title = t;
    this.author = a;
    this.yearPublished = y;
  }

  void displayInfo()
  {
    System.out.println("Title : [" + title + "] | Author : [" + author + "] | Published : [" + yearPublished + " ]");
  }

  public String gettet()
  {
    return title;
  }

}

public class task1 {
  public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book("Sonar tori", "Thakur", 1910);

    b1.displayInfo();
    b2.displayInfo();
  }
}
