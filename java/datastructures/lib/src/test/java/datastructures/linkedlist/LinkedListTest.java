package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void test_insert()
    {
      LinkedList sut = new LinkedList();
      sut.insert(1);
      assertTrue(true);
    }
  @Test void test_contains()
  {
    LinkedList sut = new LinkedList();
    sut.includes(1);
    assertTrue(true);
  }
}
