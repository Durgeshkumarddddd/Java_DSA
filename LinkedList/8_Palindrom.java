// Given a LinkedList is a Palindrome or not;

class Palindrome {

   class Node {
       int data;
       Node next;
       Node(int data){
          this.data = data;
          this.next = null;
       }
    }
    static Node head;
    static Node tail;
    
     void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // find mid Node
    public static Node findMidNode(Node head){
        // use slow and fast approach or two pointer or turtle and here approach
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;  // +1 ;
            fast = fast.next.next; // +2

        }
        return slow ;
    }

    public boolean CheckPalindrome(){
        
        if(head == null && head.next == null){
            return true;
        }
        
        // step 1 : find mid point
        Node midNode = findMidNode(head);

        // Step 2 : find Reverse after mid point ;
        Node prev = null ;
        Node current = midNode;
        Node next = null ;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 3 : Compare left Node to right Node till right is null
        Node left = head ;
        Node right = prev ;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next ;
            right = right.next;
        }
        return true;

    }
     
    public static void main(String[] args){
        Palindrome ll = new Palindrome();

        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
      System.out.println("check is Palindrom or not :"+ ll.CheckPalindrome());
    }
    
}
