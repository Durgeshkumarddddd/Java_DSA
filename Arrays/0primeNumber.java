import java.util.Scanner;

class primeNumber {
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number:");
  int num = sc.nextInt();
  boolean prime = true;
  if(num==1 ){
    System.out.println("Number is not prime");
    return;  
  }

  if(num == 2){
    System.out.println("Number is prime");
  }else {
    // num-1 or half Math.sqrt(num)
    for(int i = 2; i<= Math.sqrt(num)  ; i++){
        if(num % i == 0){
         prime = false;
        
       }
       else{
         prime = true;
        } 
      }    
       if(prime == true){
         System.out.println(num + " is a prime number.");
       }else{
         System.out.println(num + " is not a prime number.");
       }
  }
 
}
}
