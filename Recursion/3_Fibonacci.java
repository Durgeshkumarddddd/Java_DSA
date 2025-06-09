class Fibonacci {

    public static int findfib(int n ){
        // Base Case
        if (n == 0){
            return 0 ;
        }
        if (n == 1){
            return 1 ;
        }
        int fib = findfib(n -1 ) + findfib(n - 2);
        return fib ;
        
    }
     
    public static void main(String args[]){
        int n = 7 ;
         
       System.out.println( findfib(n));
    }
}
