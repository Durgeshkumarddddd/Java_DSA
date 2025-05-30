// Max Sub Array by using prefix sum 

class maxSubArr2 {
    public static void main(String args[]){
      int arr[] = {2,3,4,6,7,8,9,5};
      int []prefix = new int[arr.length];
      prefix[0] = arr[0];
      for (int i = 1; i < arr.length ; i++){
         prefix[i] = prefix[i-1] + arr[i]; 
      }
      for ( int i = 0 ; i < prefix.length ; i++){
             
      }
    }
}
