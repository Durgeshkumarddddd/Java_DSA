package Stack;
// Implement Statck push and pop using Linked List

 class UsingLinkList {
   static class Node {
        int data ;
        Node next ;
        Node(int data) {
            this.data = data ;
            this.next = null;
        }
    }

   static class stack {
    static Node head = null;

     public boolean isEmpty(){
        return head == null ;
     }

     // code for push data in stack 
     public void push(int data){
        Node newNode = new Node(data);
         
        if(head == null){
            head = newNode ;
        }
        newNode.next = head ;
        head = newNode ;
     }

     // for Pop 
     public int pop(){
        if(isEmpty()){
            return -1 ;
        }
        int top = head.data ;
        head = head.next ;
        return top ;
     }
     // code for peak 

     public int peak(){
        if(isEmpty()){
            return  -1; 
        }
        return head.data ;
     }
   }

   public static void main(String[] args){
    stack s = new stack()  ;
    s.push(5);
    s.push(6);
    s.push(7);
    s.push(9);

    while( !s.isEmpty() ){
        System.out.println(s.peak());
        s.pop();
    }
   }
}
