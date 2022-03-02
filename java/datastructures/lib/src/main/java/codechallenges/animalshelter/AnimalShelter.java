package codechallenges.animalshelter;

import datastructures.queue.Queue;

public class AnimalShelter<T> {

  Queue<T> animalShelter;
  Cat cat;
  Dog dog;

  public AnimalShelter() {
   animalShelter = new Queue<>();
  }

  public void addCat(String name, String breed, int age){
    cat = new Cat(name, breed, age);
    this.animalShelter.enqueue((T) cat);
  }

  public void addDog(String name, String breed, int age){
    dog = new Dog(name, breed, age);
    this.animalShelter.enqueue((T) dog);
  }

  public Queue<T> getAnimalShelter() {
    return animalShelter;
  }

  public void setAnimalShelter(Queue<T> animalShelter) {
    this.animalShelter = animalShelter;
  }
  @Override
  public String toString() {
    return "AnimalShelter{" +
      "animalShelter=" + animalShelter +
      '}';
  }


}
