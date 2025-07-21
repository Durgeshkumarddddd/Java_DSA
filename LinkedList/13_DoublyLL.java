  class DoublyLL {
   class Node {
        int data ;
        Node next ;
        Node prev ;
        Node (int data){
            this.data = data ;
            this.next = null;
            this.prev = null ;
        }
    }
    public static Node head;
    public static Node tail ;
    public static int Size ;

    // Insert First in doubly  link List
    public void insertFirst(int data){
        Node newNode = new Node(data);
        Size++ ;

        if(head == null){
            head = tail = newNode ;
            return ;

        }
        newNode.next = head ;
        head.prev = newNode ;
        head = newNode ;
    }

  
    // Insert Last in doubly Linked List

     public void insertLast(int data){
        Node newNode = new Node(data);
        Size++;

         if(head == null){
            head = tail = newNode ;
            return ;
         }

        Node temp = head ;

        while(temp.next != null ){
            temp = temp.next;
        }
        temp.next = newNode ;
        newNode.prev = temp;
        
    }
    
    // Remove Last Node from ll
    public Node RemoveLast(Node head){
        if(head == null){
            return null ;
        }
        Node prevNode = null ;
        Node curr = head ;
        while(curr.next != null){
            prevNode = curr ;
            curr = curr.next ;
        }
        curr.prev = null ;
        prevNode.next = curr.next ;
        Size--; 
        
        return head ;
    }

    // Remove First 
    public int RemoveFirst( ){
        if(head == null){
            System.out.println("Empty Doubly linked list");
            return Integer.MIN_VALUE ;
        }
        // when one Node is present then 
        if(Size == 1){
            int val = head.data;
            Size-- ;
            head = tail =  null ;
            return val ;
        }

        int val = head.data ;
        head = head.next ;
        head.prev = null ;
        Size-- ;
        return val ;
    }
    // Print Doubly ll
    public void printList( ){
        Node temp = head ;

        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args){
        DoublyLL dll = new DoublyLL();
        // dll.insertFirst(1);
        // dll.insertFirst(2);
        // dll.insertFirst(3);
           dll.insertLast(1);
           dll.insertLast(2);
           dll.insertLast(3);

        dll.printList(); 
        // dll.RemoveLast(head);
        // dll.printList();
        dll.RemoveFirst();
        dll.printList();

    }
}
