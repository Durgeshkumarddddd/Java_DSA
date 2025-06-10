//  given a bord of size 2*n and a tile 2*1 find no. of method that i can arrange it 

class TilesProblem {
     public static int totalWays(int n){
      // Base Case 
       if ( n == 0 ){
        return 1 ;
       }
       if ( n == 1 ){
        return 1 ;
       }
        // horizontal Tiling 
        int fnm1 = totalWays(n - 1); 

        // Vertical Tiling 
        int fnm2 = totalWays( n - 2);
        int totaltiling = fnm1 + fnm2 ;
        return totaltiling ;
     }
    public static void main(String args[]){
        int n = 4;
        System.out.println(totalWays(n));

    }
}

