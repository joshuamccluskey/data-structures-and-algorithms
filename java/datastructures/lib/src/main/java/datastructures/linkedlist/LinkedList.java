package datastructures.linkedlist;

// Credit:
// Worked and collaborated with Tony Regalado on 02/20/2022 5:00pm
// Referenced:  https://www.javatpoint.com/java-program-to-create-and-display-a-singly-linked-list

public class LinkedList {
  // Creating head and tail nodes
  Node head = null;
  Node tail = null;


  public void insert(int num) {
    Node nodeNew = new Node(num);

    if (head == null) {
      head = nodeNew;
    } else {
      tail.next = nodeNew;

    }
    tail = nodeNew;


  }

  public boolean includes(int num) {
    Node curr = head;
    while (curr != null) {
      if (curr.val == num) {
        return true;
      }
      curr = curr.next;
    }
    return false;
  }


  @Override
  public String toString() {
    String result = "";
    Node curr = head;
    if (head == null) {

      return "No Values";
    }
    while (curr != null) {

      System.out.println("{ " + curr.val + " } ->");
      curr = curr.next;

    }
    result += "NULL";
    return result;
  }


}
