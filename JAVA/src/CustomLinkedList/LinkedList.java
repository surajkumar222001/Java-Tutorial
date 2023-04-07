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

    public Node(int value, Node next){
    this.value = value;
    this.next = next;
    }
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

  public void removelast() {
    if (size == 0) {
      System.out.println("List is empty");
    } else if (size == 1) {
      head = tail = null;
      size = 0;
    } else {
      Node temp = head;
      for(int i = 0 ; i < size-2  ; i++){
        temp = temp.next;
      }
      tail = temp;
      temp.next = null;
      size--;
    }
  }

  public int getFirst(){
    if(size == 0){
      System.out.println("list is empty");
      return -1;
    }
    return head.value;
  }

  public int getLast(){
    if(size == 0){
      System.out.println("list is empty");
      return -1;
    }
    return tail.value;
  }

  public int getAtIndex(int index){
    if(index < 0 || index >= size){
       return -1;
    }else if(size == 0){
        return -1;
    } 
    Node temp = head;
    for(int i = 0 ; i < index ; i++){
       temp = temp.next;
    }
    return temp.value;
  }

  public void addAtIndex(int index , int value){
    if(index < 0 || index > size){
       System.out.println("index is out of boundry");
    }else if(index == 0){
      insertFirst(value);
    } else if(index == size){
       insertLast(value);
    }else{
      Node node = new Node(value);
      Node temp = head;
      for(int i = 0 ; i < index-1 ; i++){
           temp = temp.next;
      }
      node.next = temp.next;
      temp.next = node; 
    }
     
    size++;
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
    list.addAtIndex(1, 100);
    list.addAtIndex(1, 200);
    list.addAtIndex(4, 500);
    list.display();
    list.removelast();
    list.display();
    

  }

}
