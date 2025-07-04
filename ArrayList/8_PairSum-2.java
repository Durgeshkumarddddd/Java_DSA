import java.util.ArrayList ;

// we have given sorted and rotated arraylist we have to find out two element sum is equal to target sum ;
// for i.e   list = [11,15,2,5,6,8,9]   ,, target = 17  

class PairSum {

    public static boolean pairSum( ArrayList<Integer> list , int target){
        int pivot = 0;
        
        // while (i < list.size() && pivot == 0) {

        //     if (list.get(i) < list.get (i+ 1) ){
        //         i ++ ;
        //     }
        //     else {
        //         pivot  = i ;
        //     }
        // }

        for ( int i = 0 ; i < list.size() ; i++){
            if (list.get(i) > list.get(i + 1)){
                pivot = i ;
                break ;
            }
        }
         
        int n = list.size() ;
       int lptr = pivot + 1 ;
       int rptr = pivot ;

        while ( lptr != rptr ) {
            // By using modulo arithmetic 

            if (list.get(lptr) + list.get(rptr) == target)
            {
                return true ;
            }
            if (list.get(lptr) + list.get(rptr) < target)
            {
                lptr = (lptr + 1 ) % n ;
            }
            if (list.get(lptr) + list.get(rptr) > target){
                rptr = (n + rptr - 1 ) % n;
            }
            
        }
        return false ;


    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add (11);
        list.add (15);
        list.add (2);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
      
        int target = 12 ;
        System.out.println(pairSum(list, target));
    }
    
}
