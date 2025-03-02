
 class  first{
  public static class Node{
      int data ;
      Node next;
     public  Node(int data){
        this.data = data;
        this.next = null;
      }

  }


  public static Node head ;
  public static Node tail ;

  public void insert(int data){
     // 1.  create new Node   
    Node newNode = new Node(data);
     // 2.     
  }
  

   public static void main(String[] args){
         Node n = new Node(5);
         System.out.println(n.data);
         n.next = head;
         n.next = tail ;
         System.out.println(n.next);


    }
}
