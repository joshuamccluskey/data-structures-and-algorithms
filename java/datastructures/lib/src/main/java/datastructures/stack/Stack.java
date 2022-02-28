package datastructures.stack;

import datastructures.stack.Node;

public class Stack<T>
{
  Node<T> top;

  void push(T value)
  {
    Node newNode = new Node(value);
    if (top != null) {
      newNode.next = top;
    }
    top = newNode;
  }

  T pop()
  {
    T popValue = top.value;
    top = top.next;
    return popValue;
  }

  T peek()
  {
    return top.value;
  }

  boolean isEmpty()
  {
    return ((top == null) ? true : false);
  }
}
