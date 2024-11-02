import java.util.*;
class palindrome_no {
    public static int takeinput(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num ;
    }
    public static void main(String[] args){
           
    System.out.println("Enter a number");
    int num = takeinput();
    int reverse = 0 ;
    while(num > 0){
        int lastdigit = num % 10;
          num = num / 10;
        reverse = reverse*10 + lastdigit;
    }
    if(num == reverse){
        System.out.println("NUmber is palindrome");
    }else{ 
        System.out.println("Number is not palindrome");
    }

    }
}
