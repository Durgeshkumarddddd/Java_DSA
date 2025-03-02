 class LinkList {
    public static class Node{
        int data ;
        Node next ;
        public Node (int data){
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail;

    public static void insertFirst(int data){
       // create a node 
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode ;
        }
        // insert in the head side 
        newNode.next = head ;
        // point to head 
        head = newNode ;
    }
    public static void display(){
        Node temp = head;
        while(temp != null){
             System.out.println(temp.data);
             temp = temp.next ;
        }
    }
    public static void main(String[] args){
      LinkList ll = new LinkList();
      ll.insertFirst(1);
      ll.display();

    }
}
