class reverseBetween {
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head ;
    public static Node tail ;

    // Delete the idx node and reverse the left node to the right node.

    public static void reverseBetween(Node head, int left, int right) {
           Node ltemp = head;
           Node lprev = null;
           int i = 1;
           while(ltemp != null && i < left){
            lprev = ltemp;  
            ltemp = ltemp.next;
               i++;
           }
           Node rtemp = head;
           Node rprev = null;
           int j = 1;
           while(rtemp != null && j < right){
            rprev = rtemp ;  
            rtemp = rtemp.next;
               j++;
           }
           if(ltemp == null || rtemp == null){
            return ;
           }
           if(lprev != null){
            lprev.next = rtemp;
           }
           else{
            head = rtemp;
           }
           if(rprev != null){ 
            rprev.next = ltemp;
           }else{
            head = ltemp;
           }
           Node temp = ltemp;
           lprev.next = rtemp;
           rprev.next = temp ; 

    }
    
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }



    public static void main(String[] args){
        head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        System.out.println("Original Linked List:");
        printList(head);
        reverseBetween(head, 2, 4);
        System.out.println("Reversed Linked List:");
        printList(head);

    }
}
