 import java.util.Scanner;
 class newwhile {
    static int fn(int n){
        int h ;
       if(n==1 || n==0){
        return 1 ;
       }
       else{
          h= n*fn(n-1);
          return h;

       }
    }

    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
   int n =    fn(num);
   System.out.println("Factorial of " + num + " is " + n);
    }
}
