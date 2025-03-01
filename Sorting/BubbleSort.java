 class BubbleSort {
    static int[] bubbleSort(int []arr){
        for( int i = 0 ; i < arr.length-1 ; i++){
            for( int j = 0 ; j < arr.length-1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                     arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {12, 3, 7, 9, 5};
       int[] newarr = bubbleSort(arr);
        System.out.println("Sorted Array: ");
        for(int i = 0 ; i < newarr.length ; i++){
            System.out.print(newarr[i] + " ");
        }
    }
}
