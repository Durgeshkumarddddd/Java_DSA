import java.util.Scanner;
class SwaptwoNo {
    static void swap(int a , int b){
        int temp = a ;
        a = b ;
        b = temp ;
        System.out.println("After swapped No : ");
        System.out.println("First No :"+a);
        System.out.println("Second No :"+b);
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array:");
        int a = sc.nextInt();
        System.out.println("Enter second no :");
        int b = sc.nextInt();
        swap(a , b) ;
        System.out.println("First No: "+a+" Second No:"+b);
       
    }
}
