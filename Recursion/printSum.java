

 class printSum {
     static int printSum(int n){
        if(n == 1 ){
            return 1;
        }
        return  n + printSum(n -1);
     }

   public static void main(String[] args){
        int n = 100;
      int sum =  printSum(n);
      System.out.println("Sum of first " + n + " natural numbers is: " + sum);
   }    
}
