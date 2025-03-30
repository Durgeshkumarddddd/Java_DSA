class findSecondMax {
    public static int findMax(int []arr){
         int max = Integer.MIN_VALUE;
         for(int i = 0 ; i < arr.length ; i++){ 
            if(arr[i] > max){
                max = arr[i];
            }
         }
         return max;
    }

    public static int findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
         max = findMax(arr);
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    
    public static void main(String[] args){
        int[] arr = {10,5,20,30,40,50,};
        int secondMax = findSecondLargest(arr);

        System.out.println("Second largest number in the array is: " + secondMax);
    }
}
