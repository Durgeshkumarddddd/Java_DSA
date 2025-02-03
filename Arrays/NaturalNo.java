import java.util.Scanner;
public class NaturalNo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   System.out.print("Enter the last number of natural number: ");
   int n =  sc.nextInt();
   int sum = 0 ; 

   for(int i = 1 ; i < n ; i++){
    sum = sum+i ;
   }
   System.out.println(sum);

}
}
