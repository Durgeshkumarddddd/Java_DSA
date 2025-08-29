import java.util.Scanner;

class QueueLL {

    class Node {
        int data ;
        Node next ;
        Node (int data ){
            this.data = data ;
        }
    }
    public static Node rare ;
    public static Node front ;

    public void enqueue(int data ){
        Node newNode = new Node(data);

        if ( rare == null ){
            rare = front = newNode ;
            return ;
        }
        newNode.next = rare ;
        rare = newNode ;
    }

    public int dequeue(){
        if (front == null ){
            System.out.println("Queue is empty : ");
            return -1 ;
        }

        int top = front.data ;
        front = front.next ;

        if (front == null){
            rare = null ;
        }
        return top;
    }

    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        QueueLL ll = new QueueLL();
        int n ;
        do {
            System.out.println("Enter 1 for insert element ");
            System.out.println("enter 2 for delete ");
            System.out.println("Enter 0 for stop ");

            System.out.println("enter no : ");
            n = sc.nextInt();

            if ( n == 1 ){
                System.out.println("enter element : ");
                int data = sc.nextInt();
                ll.enqueue(data);
            }

            if (n == 2 ){
                System.out.println("deleted element : "+ ll.dequeue());
            }

        }while( n != 0);
    
    }
}
