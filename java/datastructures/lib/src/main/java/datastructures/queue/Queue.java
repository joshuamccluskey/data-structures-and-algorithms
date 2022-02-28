package datastructures.queue;

import datastructures.queue.Node;

public class Queue<T>
{
  Node<T> front;
  Node<T> back;

  void enqueue(T value)
  {
    Node newNode = new Node(value);
    if (front != null) {
      newNode.next = front;
    }
    front = newNode;
  }

  T dequeue()
  {
    T deValue = front.value;
    front = front.next;
    return deValue;
  }

  T peek()
  {
    return front.value;
  }

  boolean isEmpty()
  {
    return ((front == null) ? true: false);
  }
}
