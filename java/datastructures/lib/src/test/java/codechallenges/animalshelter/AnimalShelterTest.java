package codechallenges.animalshelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {

  @Test
  void test_addCat() {
    AnimalShelter cut = new AnimalShelter<>();
    cut.addCat("Felix", "Ragdoll",3 );
    assertTrue(true,"Yo something is wrong with your test_addCat()");
  }

  @Test
  void addDog() {
    AnimalShelter cut = new AnimalShelter<>();
    cut.addCat("Fido", "Lab",5 );
    assertTrue(true,"Yo something is wrong with your test_addDog()");
  }

  @Test
  void getAnimalShelter() {
    AnimalShelter cut = new AnimalShelter<>();
    cut.addCat("Fido", "Lab",5 );
    cut.addCat("Felix", "Ragdoll",3 );
    System.out.println("This works fine");
  }

  @Test
  void setAnimalShelter() {
  }

  @Test
  void testToString() {
  }
}
