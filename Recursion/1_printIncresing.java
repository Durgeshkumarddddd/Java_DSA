// Print no. in increasing Order.

class printIncresing {
   public static void printIncresing(int n){
    // Base Case
    if(n == 1){
        System.out.print(1);
        return ;
    }
    printIncresing(n-1);
    System.out.print(n);

   }
    
    public static void main(String args[]){
        int n = 10; 
        printIncresing(n);
    }
}
