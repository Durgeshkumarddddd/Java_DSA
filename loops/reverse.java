import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int num = sc.nextInt();
        int reverse = 0 ;
        while(num > 0) {
         int  lastdigit = num % 10 ;
          num = num / 10 ;
          reverse = reverse * 10 + lastdigit ;
        }
        System.out.println("Reversed number: " + reverse);
        }

}
