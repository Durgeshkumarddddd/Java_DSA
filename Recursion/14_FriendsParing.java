class FriendsParing {
    public static int FriendsParing(int n){
       // Base Case 
       if (n == 1 || n == 2){
        return n ;
       }
       // kaam 
       // for single or indivisual
       int fnm1 = FriendsParing(n - 1 );
       // for pair 
       int fnm2 = (n-1)* FriendsParing(n - 2);
       // total no. of pairs or ways is : 
       int totalWays = fnm1 + fnm2 ;
       return totalWays;
    }
    public static void main(String args[]){
        // if total number of friends is n ;
       int n = 3 ;
       // we have to find out the total no. of ways to meeting friends in pair and indivisual
        System.out.println(FriendsParing(n ));
    }
}