// Elephant.java
/*
 * Activity 4.9.2
 */
public class Elephant extends Hooved
{
  public Elephant() {
    System.out.println("An elephant arrives.");
  }

  public Elephant(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan); // super() call is now first
    System.out.println("An elephant arrives.");
  }
  public void trumpet()
  {
    System.out.println("The elephant trumpets.");
  }

  public void forage() // Added forage for Elephant as per instructions, even though Hooved has it. Kept for clarity if specifically asked for Elephant.
  {
    System.out.println("The elephant forages for food.");
  }
}