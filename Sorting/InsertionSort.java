 class InsertionSort {
    static void insertionSort(int []arr){
        //  First method using for loop
        // for(int i = 0 ; i < arr.length ; i++){
        //     for(int j = 0 ; j < i ; j++){
        //         if(arr[j]> arr[i]){
        //             int temp = arr[j];
        //             arr[j] = arr[i];
        //             arr[i] = temp;
        //         }
        //     }
        // }
        // using while loop 
        int n = arr.length; 
        for(int i = 1 ; i<n ; i++){
            int j = i ;
            while ( j > 0 &&  arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    
    public static void main(String[] args){
        int[] arr = {11,24,1,2,8};
        System.out.println("Unsorted array: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        insertionSort(arr);
        System.out.println("\nSorted array: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
