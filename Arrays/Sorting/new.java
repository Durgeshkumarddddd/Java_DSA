class Sorting{
    
   static void merge(int []arr, int l, int mid, int r){ 
         int n1 = mid - l;
         int n2 = r - mid;
         int []arr1 = new int[n1];
         int []arr2 = new int[n2];
         for(int i = 0 ;i < n1 ; i++){
            arr1[i] = arr[i];
         }
         System.out.println();
         System.out.print(l+"  "+mid+": "+r+": ");
         System.out.println("Left Array: ");
         for(int i = 0 ; i < n1 ; i++){
            System.out.print(arr1[i] + " ");
         }
         for(int j = 0 ; j < n2 ; j++){
            arr2[j] = arr[mid + 1 + j];
         }
         System.out.println();
         System.out.println("Array");
         for( int i = 0 ; i<arr.length ; i++){
                System.out.print(arr[i] + " ");
         } 

    }

    static void mergeSort(int []arr, int l, int r){
        if(l >= r){
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args){
        int[] arr = {10,5,8,7,2,1,9,4,6,3};
        System.out.println("Unsorted Array: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        mergeSort(arr, 0, arr.length - 1);
    }
}