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

  }

  public static void hearTheAnimal(Animal currentAnimal)
  {
     System.out.println("Let's hear this animal:");
     currentAnimal.speak();
  }
}