// Feline.java
/*
 * Activity 4.9.2
 */
public class Feline extends Animal
{
  public Feline() {
    System.out.println("A feline arrives.");
  }

  public Feline(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A feline arrives.");
  }

  public void growl()
  {
    System.out.println("The feline growls.");
  }

  public void roar()
  {
    System.out.println("The feline roars.");
  }
}