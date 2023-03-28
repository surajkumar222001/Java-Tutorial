package CustomLinkedList;

public class LinkedList {
  private Node head;
  private Node tail;
  private int size;

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    // public Node(int value, Node next){
    // this.value = value;
    // this.next = next;
    // }
  }

  public LinkedList() {
    this.size = 0;
  }

  public void insertFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
    size += 1;

  }

  public void insertLast(int value) {
    Node node = new Node(value);
    node.next = null;
    tail.next = node;
    tail = node;
    size++;

  }

  public void removefirst() {
    if (size == 0) {
      System.out.println("List is empty");
    } else if (size == 1) {
      head = tail = null;
      size = 0;
    } else {
      head = head.next;
      size--;

    }

  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.value + " -> ");
      temp = temp.next;
    }
    ;
    System.out.println("END");

  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertFirst(10);
    list.insertLast(20);
    list.display();
    list.removefirst();
    list.display();

  }

}
