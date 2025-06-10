class PowerOfx {
    
    public static int power(int x, int n ){
        // Base Case
        if (n == 1){
            return x ;
        }
        int halfpowerSqr = power(x, n/2);
        int fullpower = halfpowerSqr * halfpowerSqr;

        // case for odd 
        if (n % 2 != 0){
            fullpower = x * fullpower ;
        }
        return fullpower ;
    }
    public static void main(String args[]){
        int n = 10 ;
        int x = 2 ;
       System.out.println( power(x,n) );
    }
}
