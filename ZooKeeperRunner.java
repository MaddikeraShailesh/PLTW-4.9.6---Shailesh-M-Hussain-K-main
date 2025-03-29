// ZooKeeperRunner.java
/*
 * Activity 4.9.2
 */
import java.util.ArrayList;

public class ZooKeeperRunner
{
  public static void main(String[] args)
  {
    ArrayList<Animal> zoo = new ArrayList<Animal>();

    // Implicit Constructors
    Elephant elephant = new Elephant();
    zoo.add(elephant);

    Tiger tiger = new Tiger();
    zoo.add(tiger);

    Gorilla gorilla = new Gorilla();
    zoo.add(gorilla);

    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    zoo.add(giraffe);

    Hippo hippo = new Hippo();
    zoo.add(hippo);

    Penguin penguin = new Penguin();
    zoo.add(penguin);

    Owl owl = new Owl();
    zoo.add(owl);

    Deer deer = new Deer();
    zoo.add(deer);

    Monkey monkey = new Monkey();
    zoo.add(monkey);

    Lion lion = new Lion();
    zoo.add(lion);


    System.out.println("--- Zoo Animals Speaking ---");
    for (Animal animal : zoo) {
      System.out.println("Animal type: " + animal.getClass().getSimpleName());
      animal.speak();
      System.out.println();
    }
    System.out.println("--- End Zoo Animals Speaking ---");
    System.out.println();


    System.out.println("--- Hear the Animal Method ---");
    hearTheAnimal(elephant);
    System.out.println();
    hearTheAnimal(tiger);
    System.out.println();
    hearTheAnimal(giraffe);
    System.out.println();
    hearTheAnimal(new Animal()); // Generic Animal
    System.out.println("--- End Hear the Animal Method ---");
    System.out.println();

    // Constructing Down
    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
    a.isNocturnal();
    // a.trumpet(); // Compile-time error: cannot find symbol method trumpet() because 'trumpet()' is not defined in the Animal class.
    System.out.println();

    // Sleep method test
    Animal a1 = new Animal();
    a1.sleep();
    // Object a2 = new Animal(); // Commenting out a2 as per instructions
    // a2.sleep(); // Commenting out a2 as per instructions
    System.out.println();

    // toString method tests
    Object o = new Object();
    System.out.println("Object o toString(): " + o.toString());
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println("Elephant e toString(): " + e.toString());
    Animal a3 = new Animal();
    System.out.println("Animal a3 toString(): " + a3.toString());
    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println("Animal a4 (Elephant object) toString(): " + a4.toString());
    Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println("Object o2 (Elephant object) toString(): " + o2.toString());
  }

  public static void hearTheAnimal(Animal currentAnimal)
  {
     System.out.println("Let's hear this animal:");
     currentAnimal.speak();
  }
}