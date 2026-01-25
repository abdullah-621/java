interface Movable
{
  void move();
}

interface SoundMaker {
  void makeSound();
}

class Animal {
  String name;

  Animal(String name) {
    this.name = name;
  }

  void eat() {}
}

class Dog extends Animal implements Movable, SoundMaker {

  Dog(String name)
  {
    super(name);
  }
  @Override
  public void move() {
    System.err.println(name + " is Movable");
  }

  @Override
  public void makeSound() {
    System.err.println(name + " make sound");
  }

  @Override
  void eat() {
    System.err.println(name + " eat");
  }

}

class Bird extends Animal implements Movable, SoundMaker
{
  Bird(String name)
  {
    super(name);
  }
  @Override
  public void move()
  {
    System.err.println(name + " is Movable");
  }
  @Override
  public void makeSound()
  {
    System.err.println(name + " make sound");
  }

  @Override
  void eat()
  {
    System.err.println(name + " eat");
  }

}

public class task7 {
  public static void main(String[] args) {
    
    Dog d = new Dog("Puppy");
    Bird b = new Bird("Mithu");

    d.move();
    d.makeSound();
    d.eat();

    b.move();
    b.makeSound();
    b.eat();

  }
}
