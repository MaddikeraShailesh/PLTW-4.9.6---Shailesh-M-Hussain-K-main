// Owl.java
/*
 * Activity 4.9.2
 */
public class Owl extends Animal
{
  public Owl() {
    System.out.println("An owl arrives.");
  }

  public Owl(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("An owl arrives.");
  }

  public void hunt()
  {
    System.out.println("The owl hunts.");
  }
}