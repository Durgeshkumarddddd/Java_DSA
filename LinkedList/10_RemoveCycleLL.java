class RemoveCycleInLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static Node head;
    static Node tail;

    public static boolean isCyclic(){
        Node slow = head;
        Node fast = head;

        // Detecting a cycle in Linked List
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { 
                return true;
            }
        }
        return false;
    }

    // Remove Cycle in Linked List

    public void removeCycle() {
        Node slow = head;
        Node fast = head;

        // Detecting a cycle in Linked List
        boolean isCyclic = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { 
                isCyclic = true;
                break;
            }
        }
        if(isCyclic == false){
            System.out.println(" No Cycle found in the Linked List");
            return;
        }

        // finding the meeting point of the cycle
        slow = head;
        Node prev = null;
        while( slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Removing the cycle
        prev.next = null;


    }

    // Insert Node into middle of the LinkedList
    static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode.next = slow.next;
        slow.next = newNode;
    }

    // Printing of the Linked List
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveCycleInLinkedList ll = new RemoveCycleInLinkedList();
        // ll.insert(3);
        // ll.insert(6);
        // ll.insert(4);
        // ll.insert(5);
        // ll.insert(7);

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        System.out.println( isCyclic());
        ll.removeCycle();
        System.out.println(isCyclic());
      //printList(head);
        

    }

}
