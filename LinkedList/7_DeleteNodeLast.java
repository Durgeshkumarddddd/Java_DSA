// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

class DeleteNthNode {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;
    }

    // Delete the nth node from the end of the list
     public void deleteNthNode(int n){
        if(head == null || n < 0){
            return;
        }
        Node current = head;
        int size = 0;
        while(current != null){
            size++;
            current = current.next;
        }
        int i = 1;
        int ithNode = size - n;
        Node prev = head; 
        while(i < ithNode){
           prev = prev.next;
           i++;
        }
        prev.next = prev.next.next;
        return ;    
    }

    // Reverse the linked list
    public void reverseOrder() {
        if (head == null) {
            return;
        }
        Node prev = null;
        Node current = tail = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Linked List Traversal
    public void printLinkList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(+temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DeleteNthNode list = new DeleteNthNode();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.printLinkList();
        System.out.println("Reversed Linked List:");
        // list.reverseOrder();
        int n = 2;
        list.deleteNthNode(n);
        list.printLinkList();

    }
}
