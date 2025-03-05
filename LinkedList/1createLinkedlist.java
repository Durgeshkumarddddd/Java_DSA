class LinkList{
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static Node size;

  public static void insertFirst(int data) {
    // create a node
    Node newNode = new Node(data);
    
    if (head == null) {
      head = tail = newNode;
      
       return;
    }
    // insert in the head side
    newNode.next = head;
    // point to head
    head = newNode;
    
  }
  // Inset Node to Lost point

  public static void insertLast(int data) {
    // create a node
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    // insert at the end
    tail.next = newNode;
    // point tail to new node
    tail = newNode;

  }

  public static void display() {
    // if link List is empty
    if (head == null) {
      System.out.println("Linked List is empty now");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }
  // Delete node from linked list from first 

  public void deleteFirst(){
     Node temp = head;
     if(head == null){
        System.out.println("List is empty");
        return;
     }
     head = temp.next;
     System.out.println("Deleted first node : " + temp.data);
     temp = null;
  }
  // Delete node from last 
  public void deleteLast(){ 
    if(head == null){ 
       System.out.println("List is empty");
       return;
    }
    Node temp = head ;
    while(temp != null){
     
       if(temp.next.next == null){
        System.out.println("Deleted Last Node  : " + temp.next.data);
          temp.next = null; 
          tail = temp;
          break;
       }
       temp = temp.next;
    }
  }

  public static void main(String[] args) {
    LinkList ll = new LinkList();
    ll.insertFirst(1);
    ll.display();
    ll.insertFirst(20);
    ll.insertFirst(16);
    ll.display();
    ll.insertFirst(30);
    ll.insertFirst(50);
    ll.display();
    ll.insertLast(100);
    ll.display();
    ll.insertLast(200);
    ll.display();
    ll.deleteFirst();
    ll.deleteLast();
    ll.display();

  }
}
