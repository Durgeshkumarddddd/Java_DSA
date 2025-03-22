// Java implementation to insert node
// at the middle of the linked list

class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class GfG {
    // Function to insert a node at the
    // middle of the linked list
    static Node insertInMiddle(Node head, int x)
    {

        // If the list is empty, create a new node as the
        // head
        if (head == null) {
            return new Node(x);
        }
        else {
            // Create a new node
            Node newNode = new Node(x);
            Node slow = head;
            Node fast = head.next;

            // Move slow and fast pointers to find the
            // middle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Insert the new node in the middle
            newNode.next = slow.next;
            slow.next = newNode;

            return head;
        }
    }
    static void printList(Node head)
    {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {

        // Creating the list 1->2->4->5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        int x = 3;
        head = insertInMiddle(head, x);
        printList(head);
        
    }
}
