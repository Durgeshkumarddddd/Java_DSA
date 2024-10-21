import java.util.Scanner;
public class voting {
    void validation (int age)
 {
    if (age <18){
    throw new ArithmeticException("person is not eligible");}
    else
    System.out.println("person is eligible");
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    voting obj=new voting();
   
    System.out.println("Enter age of person");
    int n = sc.nextInt();
    obj.validation(n);
    System.out.println("rest of the code");
}
}

