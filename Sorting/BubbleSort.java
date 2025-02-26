 class BubbleSort {
    static int[] bubbleSort(int []arr){
        for( int i = 1 ; i <= arr.length ; i++){
            for( int j = 1 ; j <= arr.length - i ; j++){
                if(arr[i] < arr[j]){
                    int temp = i ;
                    i = j ;
                    j = temp ;
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
