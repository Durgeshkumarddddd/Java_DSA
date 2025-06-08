class factorial{
    public static int fact(int n){
        if ( n == 1 ){
            return 1 ;
        }
        // f n-1 = fact(n-1)
        int factmo = fact(n - 1);
         // fact = n * f n-1 ;
        int fact =  n * factmo;
        
        return fact ;
    }
    
    public static void main(String args[]){
        int n = 5 ;
       System.out.println(  fact(n) );
    }
}
