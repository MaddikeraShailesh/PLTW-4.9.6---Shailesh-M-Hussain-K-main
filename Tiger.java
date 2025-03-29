// Tiger.java
/*
 * Activity 4.9.2
 */
public class Tiger extends Feline
{
  public Tiger() {
    System.out.println("A tiger arrives.");
  }

  public Tiger(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A tiger arrives.");
  }

  public void swim()
  {
    System.out.println("The tiger swims.");
  }

  public void huntAlone()
  {
    System.out.println("The tiger hunts alone.");
  }
}