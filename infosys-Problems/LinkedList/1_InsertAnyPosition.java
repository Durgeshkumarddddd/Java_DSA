import java.util.LinkedList;
class InsertAnyPosition {
     static class Node {
        int data ;
        Node next ;

         public Node (int data){
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail ;

    // Insert first 
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode ;
            return ;
        }
        newNode.next = head ;
        head = newNode ;
    }

    // Insert Any position of LL 
    public void InsertAtPosition(int data , int position){
        Node newNode = new Node(data);
        if ( head == null){
            head = tail = newNode ;
            return ;
        }
        Node prev = null ;
        Node curr = head ;
        for ( int i = 0 ; i < position ; i++){
            prev = curr ;
            curr = curr.next ;
        }
        prev.next = newNode ;
        newNode.next = curr  ;
        
    }

    // Traverse Linked List 

    public void printLL(){
        Node temp = head ;
        while ( temp != null ){
            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.println();
    }

    public static void main(String... args){
        InsertAnyPosition ll = new InsertAnyPosition();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.printLL();

        ll.InsertAtPosition(5, 2);
        ll.printLL();


    }
}
