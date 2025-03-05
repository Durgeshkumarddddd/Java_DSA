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

    // Function to insert a node at
    // the middle of the linked list
    static Node insertInMiddle(Node head, int x){
        if (head == null) {
            return new Node(x);
        }

        Node newNode = new Node(x);
        Node currNode = head;
        int len = 0;

        // Calculate the length of the linked list
        while (currNode != null) {
            len++;
            currNode = currNode.next;
        }

        // Determine the middle position
        int count
            = (len % 2 == 0) ? (len / 2) : (len + 1) / 2;
        currNode = head;

        // Traverse to the middle node
        while (count-- > 1) {
            currNode = currNode.next;
        }

        // Insert the new node in the middle
        newNode.next = currNode.next;
        currNode.next = newNode;

        return head;
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