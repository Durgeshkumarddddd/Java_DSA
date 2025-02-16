
class mergeSort {
    static void merge(int l, int mid, int r, int[] arr) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid +1+ j];
        }
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (leftArr[i] < rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while( i < n1) {
            arr[k++] = leftArr[i++];
        }
        while( j< n2){
            arr[k++] = rightArr[j++];
        }
        

    }
    static void printArrays(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void mergesort(int l, int r, int[] arr) {
        //Base Case 
        if(l >= r){
            return ;
        }
        int mid = (l + r) / 2;
        mergesort(l, mid, arr);
        mergesort(mid + 1, r, arr);
        merge(l, mid, r, arr);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
        System.out.println("Original array:");
        printArrays(arr);
        mergesort(0, n-1, arr);
        System.out.println("\nSorted array:");
        printArrays(arr);

    }
}
