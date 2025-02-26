class printArr {
    static void printArr(int []arr, int idx){
        if(idx < 0){
            return;
         }
         printArr(arr, idx -1 ) ;     
         System.out.print(arr[idx] + " ");
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,};
        printArr(arr,arr.length-1);
    }
}
