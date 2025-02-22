import java.util.Scanner ;


 class Factorial {
   static int printFactorial(int n ){
    if(n == 1){
        return 1 ;
    }
   return printFactorial(n-1) * n ;
   }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int num = sc.nextInt();
   int fact =  printFactorial(num);
   System.out.println("Factorial of "+num+" is :"+fact);

  }    
}
