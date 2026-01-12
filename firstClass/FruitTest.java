interface SoundA {

  default void makeSound()
  {
    System.out.println("SOundA");
  }
}

interface SoundB {

  default void makeSound()
  {
    System.out.println("SoundB");
  }
}

class Speaker implements SoundA, SoundB
{
  public void makeSound()
  {
    SoundA.super.makeSound();
    SoundB.super.makeSound();
  }
}
public class FruitTest {
  public static void main(String[] args) 
  {
    Speaker s = new Speaker();
    s.makeSound();
  }

}