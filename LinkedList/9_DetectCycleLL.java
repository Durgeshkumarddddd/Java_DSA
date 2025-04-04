class DetectCyclicLinkedList {
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

    // Is Cyclic Linked List
    public boolean isCyclic() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Insert data in cyclic Linked List
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Now make the cyclic Linked List
    public void CreateCycle() {
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
    }

    

    public static void main(String[] args) {
        DetectCyclicLinkedList ll = new DetectCyclicLinkedList();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head; // Creating a cycle

        
        // ll.insert(3);
        // ll.insert(4);
        // ll.insert(5);
        // ll.insert(6);
        // ll.CreateCycle();
        System.out.println("Is cyclic: " + ll.isCyclic()); // Output: true

    }
}
