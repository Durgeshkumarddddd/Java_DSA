 class SearchByRecursion {
     static void binarySearch(int []arr, int x, int l, int r){
        if(l >= r){
            return ;
        }
        int mid = (l + r) / 2;
        if(arr[mid] == x){
            System.out.println("Element found at index: "+mid);
            return ;
        }
        if(arr[mid] > x){
            binarySearch(arr, x, mid + 1, r);
        }else{
            binarySearch(arr, x, l, mid - 1);
        }
     }

    public static void main(String[] args){
        int []arr = {12,5,53,62,33,5,19};
        int x = 33;
         binarySearch(arr, x, 0, arr.length);
    }
}
