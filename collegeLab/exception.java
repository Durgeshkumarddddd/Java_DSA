public class exception {
  public static void main(String[] args) 
  {
try{
    System.out.println("Try block");
    System.out.println(34/0);
}
catch(ArithmeticException e){
    System.out.println("Arithmetic exception");
}
finally{
    System.out.println(" i always excute");
}
  } 
}
