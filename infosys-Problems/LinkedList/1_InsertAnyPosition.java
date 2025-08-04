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
    public static void main(String... args){
        InsertAnyPosition ll = new InsertAnyPosition();
        Node newNode = new Node(5);
        newNode.next = new Node(6);
        newNode.next.next = new Node(7);

        

    }
}
