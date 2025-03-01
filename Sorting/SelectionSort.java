 class SelectionSort {
    // Method to print array
    static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    // Method to implement Selection Sort
    static void selectionSort(int[] arr) {
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }              
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 2, 7, 1, 3};
        System.out.println("Unsorted Array: ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("\nSorted Array: ");
        printArray(arr);
    }    
}
