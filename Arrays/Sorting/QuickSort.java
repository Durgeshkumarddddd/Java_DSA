 class QuickSort {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int count = 0;
        for(int i = low + 1; i <= high; i++) {
            if(arr[i]< pivot) {
                count++;
            }
        }
        int pivotIdx = low +count ;
        swap(arr, low, pivotIdx);
        int i = low;
        int j = high;
        while(i < pivotIdx && j > pivotIdx) { 
            while(arr[i] < pivot) i++ ;
            while(arr[j]> pivot) j-- ;
            if(i <= pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void quickSort(int arr[], int low, int high) {
      if(low >= high){
        return;
      }
      int pi = partition(arr, low, high);
      quickSort(arr, low, high);
      quickSort(arr, pi + 1, high);
    }
   
    public static void main(String[] args){
         int arr[] = {10, 7, 8, 9, 1, 5};
         System.out.println("Original Array:");
        
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
      
         quickSort(arr, 0, arr.length-1);
         System.out.println("\nSorted Array:");
         printArray(arr);
    }  
}
