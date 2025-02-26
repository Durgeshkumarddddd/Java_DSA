 class MulKtimes {
    static int multipleKtimes(int num, int k){
        if(k == 0){
            return 0;
        }
        int mul = num + multipleKtimes(num, k-1);
        System.out.println("multipleKtimes " + mul + " ");
        return mul;
    }

    public static void main(String[] args){
        int num = 2;
        int k = 6;
        multipleKtimes(num,k);
    }
}
