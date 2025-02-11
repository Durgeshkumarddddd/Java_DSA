 class minMax {
    static int setmin(int []arr){
     int min = Integer.MAX_VALUE;
     for(int i = 0 ; i < arr.length ; i++){
        if(arr[i]< min){
            min = arr[i];
        }
     }
     return min ;
   }    
   static int setMax (int []arr){
    int max = Integer.MIN_VALUE;
    for(int i = 0 ; i < arr.length ; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return max ;
   }
   public static void main(String[] args){
    int[] arr = {2,3,4,5,6,18,14};
    System.out.println("Minimum element : "+ setmin(arr));
    System.out.println("Maximum element : "+ setMax(arr));
   }
}
