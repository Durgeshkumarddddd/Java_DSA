 // We have given set of piller we have to find out which of the container can contain maximum water that is make by any two pillers.
 // Bruit force approach

 import java.util.ArrayList;

 class ContainerMostwater {

    // public static int storeWater ( ArrayList <Integer > list){
    //     // By using Bruit force approach

    //     int maxWater = 0 ;
    //     for ( int i = 0 ; i < list.size() ; i++ ){
    //         for ( int j = i + 1 ; j < list.size() ; j++ ){
    //             int width = j - i ; 
    //             int height = Math.min ( list.get (i), list.get (j));
    //             int currWater = width * height ;
    //             maxWater = Math.max ( currWater , maxWater );
            
    //         }

    //     }
    //     return maxWater ;
    // }

    
    // Optimize solution By using Two pointer approach 
    public static int maxStoreWater ( ArrayList <Integer > list) {
        int left = 0 ; 
        int right = list.size() - 1 ;
        int maxWater = 0 ;
        while ( left < right ) {

            int width  = right - left ;
            int height = Math.min ( list.get ( left ),  list.get ( right ));
            int waterContain = width * height ;
            maxWater = Math.max(maxWater, waterContain);
            if (list.get(left) < list.get(right)){
                left++ ;
            }
            else {
                right -- ;
            }
        }
        return maxWater ;
    }

    
    public static void main ( String args[] )
    {

        ArrayList<Integer> list = new ArrayList<>();
        list.add (1);
        list.add (8);
        list.add (6);
        list.add ( 2);
        list.add (5);
        list.add ( 4);
        list.add (8);
        list.add (3);
        list.add (9);
        
        // Bruite force 

        // System.out.println(storeWater(list));

        // Optimize Solution
        System.out.println(maxStoreWater(list));
    }
}
