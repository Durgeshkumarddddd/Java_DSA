class DetectCyclicLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
        static Node head ;
        static Node tail ;
        
        // Is Cyclic Linked List 
        public boolean isCyclic(){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }

        // Insert data in cyclic Linked List
        public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
        }
        
    }
    
    public static void main(String[] args){
      DetectCyclicLinkedList ll = new DetectCyclicLinkedList();
      ll.insert(3);

    }
}
