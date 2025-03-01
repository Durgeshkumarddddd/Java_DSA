 class BinarySearch {
    
    static int BinarySearch(int []arr, int k){
        int left = 0, right= arr.length -1;
        while(left < right){
            int mid = (left +right)/2;
            if(arr[mid]== k){
                return mid ;
            }
            else if(arr[mid] < k){
                right = mid - 1 ;
            }
            else{
                left = mid + 1 ;
            }
        } 
        return -1;  // Element not found in array.  }
    }
    public static void main(String[] args){
        int arr[] = {23,51,23,52,21,92};
        int k = 52;
        int idx = BinarySearch(arr,k);
        System.out.println(idx);
        if(idx!= -1){
            System.out.println("Element found at index: " + idx);
        }

    }
}
