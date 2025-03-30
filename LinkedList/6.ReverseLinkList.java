class ReverseLinkList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;
    }
    // Reverse the linked list 
    public void reverseOrder(){
        if(head == null){
            return;
        }
        Node prev = null;
        Node current = tail = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
   
    // Linked List Traversal 
    public void printLinkList(){
        Node temp = head ;
        while(temp != null){
            System.out.print(+temp.data+"->");
            temp = temp.next ;
        }
        System.out.println();
    }

    public static void main(String[] args){

        ReverseLinkList list = new ReverseLinkList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.printLinkList();
        System.out.println("Reversed Linked List:");
        list.reverseOrder();
        list.printLinkList();

    }
}
