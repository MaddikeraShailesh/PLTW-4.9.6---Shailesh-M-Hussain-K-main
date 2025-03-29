// Lion.java
/*
 * Activity 4.9.2
 */
public class Lion extends Feline
{
  public Lion() {
    System.out.println("A lion arrives.");
  }

  public Lion(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A lion arrives.");
  }

  public void huntInPack()
  {
    System.out.println("The lion hunts in a pack.");
  }
}