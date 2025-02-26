import java.util.Scanner;
class HCF {
    static int GCD(int x,int y){ 
             if(y == 0) return x;
             return GCD(y, x%y);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two no. for HCF");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = GCD(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
