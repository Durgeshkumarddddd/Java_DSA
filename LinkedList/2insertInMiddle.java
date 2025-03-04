class insertInMiddle {
    public static class Node{
        int data ;
        Node next ;
        public Node (int data){
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail ;
    public void insertInMiddle(int data, int pos){ 
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode ;
            return;
        }
        int i = 0;
        Node temp = head;
        System.out.println("before :"+temp.data);
        while ( i < pos-1 ){
           temp = temp.next;
           i++;   
        }
        newNode.next = temp.next;
        temp = temp.next;
        temp.next = newNode;
    }
    public static void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public  void display(){ 
        Node temp = head ;

        while(temp != null){
            System.out.print(+temp.data+"->");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static void main(String[] args){
     insertInMiddle ll = new insertInMiddle();
     ll.insertInMiddle(5, 6);
     ll.display();
     ll.insertAtBeginning(1);
     ll.insertAtBeginning(24);
     ll.insertAtBeginning(50);
     ll.insertAtBeginning(30);
     ll.insertInMiddle(10, 3);
     
     ll.display();
    }
}
