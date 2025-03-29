// Primate.java
/*
 * Activity 4.9.2
 */
public class Primate extends Animal
{
    public Primate() {
        System.out.println("A primate arrives.");
    }
    public Primate(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A primate arrives.");
    }
  public void forage()
  {
    System.out.println("The primate forages for food.");
  }

  public void speak() {
      System.out.println("Primate noises.");
  }
}