 
 class EvenandOddsort {
    static int[] swap(int[] arr , int i ,int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
        return arr ;
    }
    static int[] sort(int[] arr){
        int i = 0 ;
        int j = arr.length - 1 ;
        while(i<j){
            if(arr[i]%2==1 && arr[j]%2 == 0){
                swap(arr,i,j);
                i++ ;
                j-- ;
            }
            if(arr[i]%2 == 0 ){
                i++;
            }
            if(arr[j]%2 ==1){
                j-- ;
            }
        }
        return arr ;
    }
    public static void main(String[] args){
     int arr[] = {2,3,5,7,4,8,9,1};
    int[] sortedArr =  sort(arr);
    System.out.println("sorted Array :");
    for(int i = 0 ; i<arr.length ; i++){

          System.out.print(sortedArr[i] +"  ");
    }
    
    }
}
