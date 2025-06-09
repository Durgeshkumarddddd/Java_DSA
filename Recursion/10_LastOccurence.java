class LastOccurence {
    public static int lastOccurence(int[] arr, int key, int i){
        if (arr[i] == key){
            return i ;
        }
        // Base Case 
        if (i == 0){
            return -1 ;
        }

        return lastOccurence(arr, key, i - 1);
    }
    public static void main( String args[]){
        int[] arr = {5,3,4,9,6,8};
        int key = 5 ;
        int i = arr.length - 1 ;
       System.out.println( lastOccurence(arr,key,i));
    }
}
