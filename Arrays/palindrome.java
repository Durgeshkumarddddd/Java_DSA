 import java.util.Scanner;
 class palindrome {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = x ;
            if(x < 0){
                System.out.println("Invalid input. Please enter a non-negative integer.");
                return;
            }
            
            while(x>0){
              int digit = x % 10;
                n = n*10 + digit;
                digit = digit/10;
            }
            
            if(n == x){
                System.out.println(x + " is a palindrome.");
            }
        }
    
    }
}
