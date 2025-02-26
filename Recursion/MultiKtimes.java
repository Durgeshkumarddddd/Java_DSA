 class FindMultiple {
    static void FindMultiple(int num, int k){
        if(k ==0){
            return;
        }
        FindMultiple(num, k-1);
        System.out.print(num*k + " ");  // Prints multiples of num from num to 1 in reverse order.
    }
    
    public static void main(String[] args){
        int num = 2 ;
        int k = 6;
        FindMultiple(num, k);
    }
}
