// Monkey.java
/*
 * Activity 4.9.2
 */
public class Monkey extends Primate
{
    public Monkey() {
        System.out.println("A monkey arrives.");
    }
    public Monkey(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A monkey arrives.");
    }
  public void climb()
  {
    System.out.println("The monkey climbs.");
  }

  public void hoot()
  {
    System.out.println("The monkey hoots.");
  }

  public void howl()
  {
    System.out.println("The monkey howls.");
  }
}