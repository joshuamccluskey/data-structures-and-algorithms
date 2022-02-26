package datastructures;

import datastructures.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void test_insert()
    {
      LinkedList sut = new LinkedList();
      sut.insert(1);
      sut.insert(2);
      sut.insert(3);
      sut.toString();
      assertTrue(true, "Yo you need to look at insert()");
    }
  @Test void test_contains()
  {
    LinkedList sut = new LinkedList();
    sut.includes(1);
    assertTrue(true, "Yo you need to look at contains()");
  }
  @Test void test_toString()
 {
  LinkedList sut = new LinkedList();
  sut.toString();
  assertTrue(true, "Yo you need to look at toString()");
 }
}
