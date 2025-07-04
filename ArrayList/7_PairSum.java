import java.util.ArrayList ;
class PairSum {
    
    // Bruit Force approach to solve two sum problem 
    // public static boolean PairSum(ArrayList<Integer> list, int targetSum ){

    //     for (int i = 0 ; i < list.size() ; i++ ){

    //         for ( int j = i + 1 ; j < list.size() ; j++){

    //              if (list.get(i) + list.get(j) == targetSum ){

    //                 return true ;

    //              }

    //         }

    //     }

    //     return false ;
    // }

    // Optimize solution for two sum problem By using two pointer approach.

    public static boolean PairSum ( ArrayList<Integer> list, int targetSum ) {
     int left = 0 ; 
     int right = list.size() - 1 ;
     
     while ( left < right ){
        if ( list.get(left) + list.get(right) == targetSum ){
            return true;
        }
        if ( list.get(left) + list.get(right) < targetSum){
            left++ ;
        }
        if (list.get(left) + list.get(right) > targetSum){
            right--;
        }
     }
     return false ;
    
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1  ; i < 8 ; i++){

            list.add (i);

        }
        int targetSum = 5 ;

        System.out.println ( PairSum ( list, targetSum ) );
    }
}
