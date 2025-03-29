// Gorilla.java
/*
 * Activity 4.9.2
 */
public class Gorilla extends Primate
{
    public Gorilla() {
        System.out.println("A gorilla arrives.");
    }
    public Gorilla(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A gorilla arrives.");
    }
  public void grunt()
  {
    System.out.println("The gorilla grunts.");
  }

  public void speak() {
      grunt();
  }
}