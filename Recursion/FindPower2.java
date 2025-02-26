 class FindPower {
    static int power(int p, int q){
        if(q == 0 ) return 1;
        int smallPower = power(p, q/2);
        if(q % 2 == 0) return smallPower * smallPower;
        else return p * smallPower * smallPower;
    }
    
    public static void main(String[] args){
        int base = 2;
        int exponent = 3;
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}
