package datastructures.linkedlist;


public class LinkedList{
  Node head = null;
  Node tail = null;



  public void insert (int num){
    Node nodeNew = new Node(num);
    if (head != null) {
      nodeNew.next = head;
    } else {
      head = nodeNew;
    }

}

public boolean includes (int num){
  Node curr = head;
  while (curr != null) {
    if(curr.val == num){
      return true;
    }
    curr = curr.next;
  }
  return false;
}



  @Override
  public String toString() {
    return "{ " +
      head +
      " } -> { " + head.next  + " } -> { " + tail +
      "} -> NULL";
  }
}
