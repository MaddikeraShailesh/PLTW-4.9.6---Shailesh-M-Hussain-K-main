// ZooKeeperRunner.java
/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  {
    // Implicit Constructors
    Elephant elephant = new Elephant();
    elephant.trumpet();
    System.out.println();

    Tiger tiger = new Tiger();
    tiger.swim();
    tiger.huntAlone();
    tiger.roar();
    tiger.growl();
    tiger.eat();
    tiger.isNocturnal();
    tiger.getLifeSpan();
    System.out.println();
    // Tiger hierarchy: Tiger -> Feline -> Animal -> Object

    // Explicit Constructors
    Elephant elephant2 = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant2.trumpet();
    elephant2.eat();
    elephant2.isNocturnal();
    elephant2.getLifeSpan();
    System.out.println();

    Tiger tiger2 = new Tiger("meat", true, 17.0);
    tiger2.swim();
    tiger2.huntAlone();
    tiger2.eat();
    tiger2.isNocturnal();
    tiger2.getLifeSpan();
    System.out.println();

    Tiger tiger3 = new Tiger();
    Elephant elephant3 = new Elephant();
    System.out.println();

    Gorilla gorilla = new Gorilla();
    gorilla.grunt();
    System.out.println();

    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();
    System.out.println();

    Hippo hippo = new Hippo();
    hippo.eat();
    System.out.println();

    Penguin penguin = new Penguin();
    penguin.fish();
    System.out.println();

    Owl owl = new Owl();
    owl.hunt();
    System.out.println();

    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();
    owl2.isNocturnal();
    owl2.getLifeSpan();
    System.out.println();
  }
}