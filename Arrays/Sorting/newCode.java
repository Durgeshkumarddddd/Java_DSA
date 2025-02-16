// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static void merge(int l, int mid, int r,int[] arr){
        int n1 = mid-l+1 ;
        int n2 = r-mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(int i = 0 ; i<n1 ; i++){ 
            arr1[i] = arr[l+i];
        }
        for(int i = 0 ;i< n1 ; i++){
            System.out.print(arr1[i] + "");
        }
        for(int j = 0 ; j<n2 ; j++){ 
            arr2[j] = arr[mid+1+j];
        }
        for(int i = 0 ;i< n2 ; i++){
            System.out.print(arr2[i]+" ");
        }

        int k = 0, i = 0, j=0  ;
        while(i<n1 && j < n2){
            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }else{
                arr[k++] = arr2[j++];
            }
        }
        while( i < n1 ){
            arr[k++] = arr1[i++];
        }
        while(j < n2){ 
            arr[k++] = arr2[j++];
        }
    }
    static void printArr(int[] arr){
        for(int i = 0 ; i < arr.length-1 ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
   static void mergeSort(int l , int r, int[]arr){
        // Base Case
        if(l >= r){ 
            return ;
        }
        int mid = (l+r)/2 ;
        mergeSort(l, mid, arr);
        mergeSort(mid+1, r, arr);
        merge(l, mid, r, arr);
    }
    public static void main(String[] args) {
          int []arr = {12,55,23,9,24,87,45};
          int l = 0 ; 
          int r = arr.length-1 ;
          printArr(arr);
          mergeSort(l,r, arr);
          printArr(arr);
    }
}
