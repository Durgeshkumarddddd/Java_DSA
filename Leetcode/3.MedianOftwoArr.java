 class MedianOftwoArr {

    static float findMedian(int[] nums1,int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length ;
        int n3 = n1+n2 ;
        int[] arr3 = new int[n3];
        int i = 0 ; 
        int j = 0 ;
        int k = 0 ;
        while(k < n3){
          
         if( nums1[i] < nums2[j] && i < n1){
            arr3[k++] = nums1[i++];
         }
         if( nums1[i] > nums2[j] && j < n2){
            arr3[k++] = nums2[j++];
         }
         while( i < n1 ){
            arr3[k++] = nums1[i++];
         }
         while( j < n2){
            arr3[k++] = nums2[j++];
         }
        
        }
        if( n3 % 2 == 1){
            return (float)arr3[n3/2];
        }
        else{
            return (float)((arr3[n3/2 - 1] + arr3[n3/2]) / 2.0);
        }
        
    }
    
    public static void main(String[] args){
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        
        float median = findMedian(arr1, arr2);
            
        System.out.println("Median: " + median);
    }
}
