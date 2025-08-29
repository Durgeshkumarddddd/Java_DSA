
import java.util.Scanner;
class Queue {
    
   static int[] arr = new int[5];
    int front = -1 ;
    int rear = -1 ;

    public void enqueue(int data){
        if ( rear == arr.length - 1 ){
            System.out.println("Queue is full ");
            return ;
        }
        if ( front == -1 ){
            front = 0 ;
        }
        arr[++rear] = data ;
    } 

    public int dequeue(){
        if (front == -1 || front > rear){
            System.out.println("Queue is Empty :");
            return -1 ;
        }
        return arr[front++];
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Queue a = new Queue();
        int n ;
        do {
            System.out.println("Enter 1 for insert data :");
            System.out.println("Enter 2 for delete :");
            System.out.println("Enter 0 for stop : ");

            System.out.println("Enter no : ");
             n = sc.nextInt();

            if ( n == 1 ){
                System.out.println("Enter element want to insert : ");
                int data = sc.nextInt();
                a.enqueue(data);
            }
            if (n == 2 ){
                System.out.println("dequeue element : "+ a.dequeue());
            }


        }while (n != 0);
        sc.close();
    }
}

/*
 * ✅ 1. Simple Queue using Array

A simple queue has two main pointers:

front → points to the first element

rear → points to the last element

Steps

Initialize front = -1 and rear = -1.

Enqueue (insert):

Check if rear == size - 1 → Queue is full.

If front == -1, set front = 0.

Increment rear and insert element.

Dequeue (remove):

Check if front == -1 or front > rear → Queue is empty.

Return element at front and increment front.
 */
