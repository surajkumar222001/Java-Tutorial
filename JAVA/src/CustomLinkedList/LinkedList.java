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
    if (head == null) {
        head = tail = node;
    } else {
        node.next = head;
        head = node;
    }
    size++;

  }
  public void insertLast(int value) {
    Node node = new Node(value);
    if (tail == null) {
        head = tail = node;
    } else {
        tail.next = node;
        tail = node;
    }
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
      for (int i = 0; i < size - 2; i++) {
          temp = temp.next;
      }
      tail = temp;
      temp.next = null;
      size--;
  }
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
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    ;
    System.out.println("END");

  }

  private Node getNodeAt(int index){
    Node temp = head;
    for(int i = 0 ; i < index ; i++){
       temp = temp.next;
    }
    return temp;
  }

  // reverse node data using pointer without  next property 
  public void reverseDI() {
    int li = 0;
    int ri = size - 1;
    while (li < ri) {
        Node liNode = getNodeAt(li);
        Node riNode = getNodeAt(ri);
        int temp = liNode.value;
        liNode.value = riNode.value;
        riNode.value = temp;
        li++;
        ri--;
    }
}


  // reverse a linked list - pointer iterative

  public void reversePI(){
    Node prev = null ;
    Node curr = head ;
    while(curr.next != null){
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node temp = head;
    head = tail;
    tail = temp;

  }

  //kth element of linkedlist from end(not use size and loop method)

  public int KthElement(int k){
      Node smallPointer = head;
      Node Highpointer = head;

      for(int i=0 ; i < k ; i++){
      Highpointer = Highpointer.next;
      }

      while(Highpointer != tail){
       smallPointer = smallPointer.next;
       Highpointer = Highpointer.next;
      }


      return smallPointer.value;
  }


  public int Mid(){
    Node slow = head;
    Node fast = head;
    while(fast.next != null && fast.next.next != null){
     slow = slow.next;
     fast = fast.next.next;
    }
    return slow.value;
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertFirst(10);
    list.insertLast(20);
    list.addAtIndex(1, 100);
    list.addAtIndex(1, 200);
    list.addAtIndex(4, 500);
    list.display();
    list.reversePI();
    list.display();
    
    

  }

}


