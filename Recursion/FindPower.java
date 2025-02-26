
// Too find the p power q 
 class FindPower {
    static int power(int p, int q){
        if( q == 0) return 1;
        
        return p * power(p, q-1);

    }

    public static void main(String[] args){
        int p = 2;
        int q = 5 ;
        int result = power(p, q);
        System.out.println(p + " raised to the power of " + q + " is " + result);
    }
}
