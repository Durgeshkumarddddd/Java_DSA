 class kthSmallElement {
   public static int smallval(int []arr){
        int max = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] < max){
                max = arr[i];
            }
        }
        return max;
    }
    
   public static int kthSmallest(int []arr, int k ){
        
        for(int i = 1 ; i < k ; i++){
             = smallval(arr);
           arr[i] = Integer.MAX_VALUE;
          
        }
        int newSmallest = smallval(arr);
        return newSmallest;
    }
      
 public static void main(String[] args){
    int arr[] = {1,2,3,4,5,6,7,8};
    int k = 4 ;
    int result = kthSmallest(arr, k);
    System.out.println("Kth smallest element is : " + result);
 }    
}
