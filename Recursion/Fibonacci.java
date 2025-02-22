import java.util.Scanner;

 class Fibonacci {
    static int fibonacci(int n){
        if(n == 0 ){
            return 0 ;
        }
        if(n == 1 ){
            return 1 ;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of terms :");
     int n = sc.nextInt();
     System.out.println("Fibonacci series of "+ n +" terms :"+ fibonacci(n));
  }    
}
