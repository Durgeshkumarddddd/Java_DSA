package SDE_CRT.ARRAY;
class RainWaterTraping{
   static int trap(int []arr){
   int n = arr.length ;
   int[] Left = new int[n];
   int[] Right = new int[n];
    Left[0] = arr[0];
    
    for( int i = 1 ; i<n ; i++){
        Left[i] = Math.max(Left[i-1], arr[i]);
    }
    Right[n-1] = arr[n-1];
    for( int i = n-2 ; i>=0 ; i--){
        Right[i] = Math.max(Right[i+1], arr[i]);

    }
    int total = 0 ; 
    for( int i = 0 ; i<n ; i++){ 
        total += Math.min(Left[i], Right[i]) - arr[i];  
 
    }
  return total ;
   }

    public static void main(String[] args){
         int[] arr = {3,1,2,4,0,1,3,2};
         int n = arr.length;
         int result = trap(arr);
         System.out.println("Total water trapped : "+result);    
    }
}